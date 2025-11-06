package com.ada.ecommerce.service;

import com.ada.ecommerce.model.Cupom;
import com.ada.ecommerce.repository.CupomRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CupomService {

    private final CupomRepository repository;

    public CupomService(CupomRepository repository) {
        this.repository = repository;
    }

    // Cria/Atualiza um cupom (com validação)
    public Cupom salvar(Cupom cupom) {
        if (cupom.getCodigo() == null || cupom.getCodigo().isBlank()) {
            throw new IllegalArgumentException("O código do cupom é obrigatório.");
        }
        if (cupom.getPercentualDesconto() <= 0 || cupom.getPercentualDesconto() > 100) {
            throw new IllegalArgumentException("O percentual de desconto deve ser entre 0 e 100.");
        }
        return repository.save(cupom);
    }

    // Busca cupom pelo código (que é o ID)
    public Cupom buscarPorCodigo(String codigo) {
        return repository.findById(codigo)
                .orElseThrow(() -> new IllegalArgumentException("Cupom não encontrado com código: " + codigo));
    }

    // Lista todos os cupons
    public List<Cupom> listarTodos() {
        return repository.findAll();
    }

    // Deleta cupom
    public void deletar(String codigo) {
        repository.deleteById(codigo);
    }
}