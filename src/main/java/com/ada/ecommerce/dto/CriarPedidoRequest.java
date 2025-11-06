package com.ada.ecommerce.dto;

import java.util.UUID;
import lombok.Data;
import jakarta.validation.constraints.NotNull;

@Data
public class CriarPedidoRequest {
    @NotNull(message = "O campo clienteId é obrigatório")
    // Usaremos o ID do Cliente para buscar a entidade no Service
    private UUID clienteId;
}