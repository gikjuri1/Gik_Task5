package ru.Gik.Task5.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AccountPoolDTO (
        @NotNull(message = "Не должен быть пустым")
        Long id,
        @Size(min = 0, max = 50)
        String branchCode,
        @Size(min = 0, max = 30)
        String currencyCode,
        @Size(min = 0, max = 50)
        String mdmCode,
        @Size(min = 0, max = 30)
        String priorityCode,
        @Size(min = 0, max = 50)
        String registryTypeCode
)
{}
