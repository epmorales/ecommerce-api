package com.ada.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.UUID;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Marca como tabela no banco de dados
@Data // (Lombok) Cria getters, setters, etc.
@NoArgsConstructor // Construtor vazio que o JPA exige
public class Produto {

    @Id // Marca como Chave Primária
    @GeneratedValue(strategy = GenerationType.AUTO) // Gera o ID (UUID) automaticamente
    private UUID id;

    private String nome; // Do seu código original
    private double precoBase; // Do seu código original

    // Construtor para uso manual
    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }
}