package ru.Gik.Task5.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TppProductRegisterDTO (
        @NotNull(message = "Не должен быть пустым")
        Long id,
     Long productId,
        @Size(min = 0, max = 100)
        String type,
     Long account,
        @Size(min = 0, max = 50)
        String currencyCode,
        @Size(min = 0, max = 50)
        String state,
        @Size(min = 0, max = 25)
        String accountNumber
)
{}
