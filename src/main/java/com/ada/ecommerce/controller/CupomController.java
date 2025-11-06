package com.ada.ecommerce.controller;

import com.ada.ecommerce.model.Cupom;
import com.ada.ecommerce.service.CupomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cupons") // Define a rota base: http://localhost:8080/cupons
public class CupomController {

    private final CupomService service;

    public CupomController(CupomService service) {
        this.service = service;
    }

    // 1. POST /cupons - Cadastrar Cupom (Opção 10 do menu original)
    @PostMapping
    public ResponseEntity<Cupom> criar(@RequestBody Cupom cupom) {
        Cupom novoCupom = service.salvar(cupom);
        // Resposta HTTP 201 Created
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCupom);
    }

    // 2. GET /cupons - Listar todos os cupons (Substituindo a listagem interna)
    @GetMapping
    public ResponseEntity<List<Cupom>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    // 3. GET /cupons/{codigo} - Buscar por código
    @GetMapping("/{codigo}")
    public ResponseEntity<Cupom> buscarPorCodigo(@PathVariable String codigo) {
        return ResponseEntity.ok(service.buscarPorCodigo(codigo));
    }

    // 4. PUT /cupons/{codigo} - Atualização Completa
    @PutMapping("/{codigo}")
    public ResponseEntity<Cupom> atualizarCompleto(@PathVariable String codigo, @RequestBody Cupom cupom) {
        // Como o ID é o código, o método salvar funciona para atualização se o ID já existir.
        Cupom cupomExistente = service.buscarPorCodigo(codigo);
        cupomExistente.setPercentualDesconto(cupom.getPercentualDesconto());
        return ResponseEntity.ok(service.salvar(cupomExistente));
    }

    // 5. DELETE /cupons/{codigo} - Deletar
    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> deletar(@PathVariable String codigo) {
        service.deletar(codigo);
        // Resposta HTTP 204 No Content
        return ResponseEntity.noContent().build();
    }
}