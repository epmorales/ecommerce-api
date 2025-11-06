package com.ada.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // Propriedades do seu projeto original
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String cpf;

    public Cliente(String nome, LocalDate dataNascimento, String email, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
    }
}