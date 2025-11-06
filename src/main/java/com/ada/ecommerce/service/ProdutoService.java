package com.ada.ecommerce.service;

import com.ada.ecommerce.model.Produto;
import com.ada.ecommerce.repository.ProdutoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto) {
        if (produto.getPrecoBase() <= 0) {
            throw new IllegalArgumentException("O preço base deve ser maior que zero.");
        }
        return repository.save(produto);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto buscarPorId(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado com ID: " + id));
    }

    public void deletar(UUID id) {
        repository.deleteById(id);
    }

    public Produto atualizar(UUID id, Produto produtoAtualizado) {
        Produto produtoExistente = buscarPorId(id);
        produtoExistente.setNome(produtoAtualizado.getNome());
        produtoExistente.setPrecoBase(produtoAtualizado.getPrecoBase());
        return salvar(produtoExistente);
    }

    public Produto atualizarParcial(UUID id, Produto produtoParcial) {
        Produto produtoExistente = buscarPorId(id);
        if (produtoParcial.getNome() != null && !produtoParcial.getNome().isBlank()) {
            produtoExistente.setNome(produtoParcial.getNome());
        }
        if (produtoParcial.getPrecoBase() > 0) {
            produtoExistente.setPrecoBase(produtoParcial.getPrecoBase());
        }

        return salvar(produtoExistente);
    }
}