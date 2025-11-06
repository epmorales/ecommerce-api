package com.ada.ecommerce.controller;

import com.ada.ecommerce.model.Cliente;
import com.ada.ecommerce.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/clientes") // Define a rota base: http://localhost:8080/clientes
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    // 1. POST /clientes - Cadastrar Cliente (Opção 1 do menu original)
    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente) {
        Cliente novoCliente = service.salvar(cliente);
        // Resposta HTTP 201 Created
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente);
    }

    // 2. GET /clientes - Listar Clientes (Opção 2 do menu original)
    @GetMapping
    public ResponseEntity<List<Cliente>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    // 3. GET /clientes/{id} - Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable UUID id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    // 4. PUT /clientes/{id} - Atualização Completa (Opção 3 do menu original)
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizarCompleto(@PathVariable UUID id, @RequestBody Cliente cliente) {
        Cliente clienteAtualizado = service.atualizar(id, cliente);
        return ResponseEntity.ok(clienteAtualizado);
    }

    // 5. DELETE /clientes/{id} - Deletar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        service.deletar(id);
        // Resposta HTTP 204 No Content
        return ResponseEntity.noContent().build();
    }
}