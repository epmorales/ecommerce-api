package com.ada.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // O produto referenciado
    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    private int quantidade;
    private double precoUnitarioNoPedido; // Preço do produto no momento do pedido

    // Relacionamento com Pedido (muitos Itens para um Pedido)
    @ManyToOne
    private Pedido pedido;
}