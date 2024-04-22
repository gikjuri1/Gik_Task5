package ru.Gik.Task5.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public record TppProductDTO (
        @NotNull(message = "Не должен быть пустым")
        Long id,
     Long productCodeId,
     Long clientId,
        @Size(min = 0, max = 50)
        String type,
        @Size(min = 0, max = 50)
        String number,
     Long priority,
     Date dateOfConclusion,
     Date startDateTime,
     Date endDateTime,
     Long days,
     Double penaltyRate,
     Double nso,
     Double thresholdAmount,
        @Size(min = 0, max = 50)
     String requisiteType,
        @Size(min = 0, max = 50)
        String interestRateType,
     Double taxRate,
        @Size(min = 0, max = 100)
     String reasoneClose,
        @Size(min = 0, max = 50)
        String state
)
{}
