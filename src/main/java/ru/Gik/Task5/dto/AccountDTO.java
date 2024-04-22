package ru.Gik.Task5.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AccountDTO (
        @NotNull(message = "Не должен быть пустым")
        Long id,
    Long accountPoolId,
        @Size(min = 0, max = 25)
        String accountNumber,
    Boolean bussy
){}

