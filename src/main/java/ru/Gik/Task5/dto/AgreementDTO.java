package ru.Gik.Task5.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public record AgreementDTO (
        @NotNull(message = "Не должен быть пустым")
        Long id,
     Long productId,
        @Size(min = 0, max = 50)
        String generalAgreementId,
        @Size(min = 0, max = 50)
        String supplementaryAgreementId,
        @Size(min = 0, max = 50)
        String arrangementType,
     Long shedulerJobId,
        @Size(min = 0, max = 50)
        String number,
     Date openingDate,
     Date closingDate,
     Date cancelDate,
     Long validityDuration,
        @Size(min = 0, max = 100)
        String cancellationReason,
        @Size(min = 0, max = 50)
        String status,
     Date interestCalculationDate,
     Double interestRate,
     Double coefficient,
        @Size(min = 0, max = 50)
        String coefficientAction,
     Double minimumInterestRate,
     Double minimumInterestRateCoefficient,
        @Size(min = 0, max = 50)
     String minimumInterestRateCoefficientAction,
     Double maximalInterestRate,
     Double maximalInterestRateCoefficient,
        @Size(min = 0, max = 50)
        String maximalInterestRateCoefficientAction
)
{}
