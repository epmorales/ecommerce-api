package com.ada.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Pedido {

    // Status do Pedido para simular a lógica do projeto original
    public enum Status { ABERTO, FECHADO }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // Cliente que fez o pedido
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    // Itens do Pedido (Mapeamento da lista de Itens)
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemPedido> itens;

    // Cupom aplicado
    @ManyToOne
    @JoinColumn(name = "cupom_codigo")
    private Cupom cupom;

    private LocalDateTime dataCriacao = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private Status status = Status.ABERTO;

    private double valorTotalBruto;
    private double valorDesconto;
    private double valorTotalLiquido;

    // Getters e Setters já vêm do @Data (Lombok)
}