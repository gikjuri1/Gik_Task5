package ru.Gik.Task5.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TppRefProductClassDTO (
        @NotNull(message = "Не должен быть пустым")
        Long internalId,
        @Size(min = 0, max = 100)
        String value,
        @Size(min = 0, max = 50)
        String gbiCode,
        @Size(min = 0, max = 100)
        String gbiName,
        @Size(min = 0, max = 50)
        String productRowCode,
        @Size(min = 0, max = 100)
        String productRowName,
        @Size(min = 0, max = 50)
        String subclassCode,
        @Size(min = 0, max = 100)
        String subclassName
)
{}
