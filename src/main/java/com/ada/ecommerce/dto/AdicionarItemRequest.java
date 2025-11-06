package com.ada.ecommerce.dto;

import java.util.UUID;
import lombok.Data;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Data
public class AdicionarItemRequest {
    @NotNull(message = "O campo produtoId é obrigatório")
    private UUID produtoId;

    @NotNull(message = "A quantidade é obrigatória")
    @Min(value = 1, message = "A quantidade deve ser maior que zero")
    private Integer quantidade;
}
