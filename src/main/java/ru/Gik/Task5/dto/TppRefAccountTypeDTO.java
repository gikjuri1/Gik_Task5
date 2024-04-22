package ru.Gik.Task5.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TppRefAccountTypeDTO (
        @NotNull(message = "Не должен быть пустым")
        Long internalId,
        @Size(min = 0, max = 100)
        String value
)
{}
