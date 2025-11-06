package com.ada.ecommerce.repository;

import com.ada.ecommerce.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<[Entidade], [Tipo de dado da Chave Primária (String neste caso)]>
public interface CupomRepository extends JpaRepository<Cupom, String> {

    // O CRUD completo já está disponível. Podemos buscar por código, que é o ID.
}