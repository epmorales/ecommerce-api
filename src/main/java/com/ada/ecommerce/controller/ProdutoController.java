package com.ada.ecommerce.controller;

import com.ada.ecommerce.model.Produto;
import com.ada.ecommerce.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController // Marca como uma API REST
@RequestMapping("/produtos") // Define a URL base: /produtos
public class ProdutoController {

    // O Spring injeta o Serviço aqui
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    // 1. GET /produtos - Listar todos (Chamado no case 5 do seu Main)
    @GetMapping
    public ResponseEntity<List<Produto>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    // 2. GET /produtos/{id} - Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable UUID id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    // 3. POST /produtos - Cadastrar (Chamado no case 4 do seu Main)
    @PostMapping
    public ResponseEntity<Produto> criar(@RequestBody Produto produto) {
        Produto novoProduto = service.salvar(produto);
        // Retorna Status 201 Created
        return ResponseEntity.status(HttpStatus.CREATED).body(novoProduto);
    }

    // 4. PUT /produtos/{id} - Atualização Completa (Chamado no case 6 do seu Main)
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizarCompleto(@PathVariable UUID id, @RequestBody Produto produto) {
        Produto produtoAtualizado = service.atualizar(id, produto);
        return ResponseEntity.ok(produtoAtualizado);
    }

    // 5. PATCH /produtos/{id} - Atualização Parcial
    @PatchMapping("/{id}")
    public ResponseEntity<Produto> atualizarParcial(@PathVariable UUID id, @RequestBody Produto produto) {
        Produto produtoAtualizado = service.atualizarParcial(id, produto);
        return ResponseEntity.ok(produtoAtualizado);
    }

    // 6. DELETE /produtos/{id} - Deletar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        service.deletar(id);
        // Retorna Status 204 No Content
        return ResponseEntity.noContent().build();
    }
}