package com.ada.ecommerce.controller;

import com.ada.ecommerce.dto.AdicionarItemRequest;
import com.ada.ecommerce.dto.CriarPedidoRequest;
import com.ada.ecommerce.model.Pedido;
import com.ada.ecommerce.service.PedidoService; // 👈 Importante!
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    // 1. Definição do Service como final
    private final PedidoService service;

    // 2. Construtor para Injeção de Dependência
    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Pedido> criarPedido(@Valid @RequestBody CriarPedidoRequest request) {
        Pedido novoPedido = service.criarPedido(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPedido);
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable UUID id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/itens")
    public ResponseEntity<Pedido> adicionarItem(@PathVariable UUID id, @RequestBody AdicionarItemRequest request) {
        Pedido pedidoAtualizado = service.adicionarItem(id, request);
        return ResponseEntity.ok(pedidoAtualizado);
    }

    // ... restante dos métodos (PUT, etc.) ...
}