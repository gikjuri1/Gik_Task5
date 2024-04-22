package ru.Gik.Task5.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public record TppRefProductRegisterTypeDTO (
        @NotNull(message = "Не должен быть пустым")
        Long internalId,
        @Size(min = 0, max = 100)
        String value,
        @Size(min = 0, max = 100)
        String registerTypeName,
        @Size(min = 0, max = 100)
        String productClassCode,
     Date registerTypeStartDate,
     Date registerTypeEndDate,
        @Size(min = 0, max = 100)
        String accountType
)
{}
