package com.ada.ecommerce.repository;

import com.ada.ecommerce.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

// JpaRepository<[Qual Entidade], [Tipo de dado da Chave Primária]>
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {

    // O Spring Data JPA já fornece o CRUD completo para Cliente.
}