package com.ada.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

// Nota: O ID será o próprio código do cupom (String) para facilitar a busca.
@Entity
@Data
@NoArgsConstructor
public class Cupom {

    // O código do cupom (ex: DESCONTO10) será a chave primária
    @Id
    private String codigo;

    private double percentualDesconto; // Ex: 10.0 para 10%

    // Construtor para uso manual/no código
    public Cupom(String codigo, double percentualDesconto) {
        this.codigo = codigo;
        this.percentualDesconto = percentualDesconto;
    }
}