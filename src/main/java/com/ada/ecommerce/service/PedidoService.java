package com.ada.ecommerce.service;

import com.ada.ecommerce.model.*;
import com.ada.ecommerce.repository.PedidoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ClienteService clienteService;
    private final ProdutoService produtoService;
    private final CupomService cupomService;

    public PedidoService(PedidoRepository pedidoRepository, ClienteService clienteService, ProdutoService produtoService, CupomService cupomService) {
        this.pedidoRepository = pedidoRepository;
        this.clienteService = clienteService;
        this.produtoService = produtoService;
        this.cupomService = cupomService;
    }

    @Transactional
    public Pedido criarPedido(com.ada.ecommerce.dto.CriarPedidoRequest request) {
        if (request.getClienteId() == null) {
            throw new IllegalArgumentException("O campo clienteId é obrigatório e não pode ser nulo.");
        }
        Cliente cliente = clienteService.buscarPorId(request.getClienteId());
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setStatus(Pedido.Status.ABERTO);
        pedido.setValorTotalBruto(0.0);
        pedido.setValorDesconto(0.0);
        pedido.setValorTotalLiquido(0.0);
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    public Pedido buscarPorId(UUID id) {
        return pedidoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado com ID: " + id));
    }

    public void deletar(UUID id) {
        Pedido pedido = buscarPorId(id);
        pedidoRepository.delete(pedido);
    }

    @Transactional
    public Pedido adicionarItem(UUID pedidoId, com.ada.ecommerce.dto.AdicionarItemRequest request) {
        Pedido pedido = buscarPorId(pedidoId);
        Produto produto = produtoService.buscarPorId(request.getProdutoId());
        ItemPedido item = new ItemPedido();
        item.setProduto(produto);
        item.setQuantidade(request.getQuantidade());
        item.setPrecoUnitarioNoPedido(produto.getPrecoBase());
        item.setPedido(pedido);
        if (pedido.getItens() == null) {
            pedido.setItens(new java.util.ArrayList<>());
        }
        pedido.getItens().add(item);
        double totalBruto = pedido.getValorTotalBruto() + (produto.getPrecoBase() * request.getQuantidade());
        pedido.setValorTotalBruto(totalBruto);
        pedido.setValorTotalLiquido(totalBruto - pedido.getValorDesconto());
        return pedidoRepository.save(pedido);
    }
}