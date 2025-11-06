package com.ada.ecommerce.repository;

import com.ada.ecommerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PedidoRepository extends JpaRepository<Pedido, UUID> {
}