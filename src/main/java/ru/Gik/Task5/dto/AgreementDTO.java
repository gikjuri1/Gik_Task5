package ru.Gik.Task5.dto;

import java.util.Date;

public record AgreementDTO (
     Long id,
     Long productId,
     String generalAgreementId,
     String supplementaryAgreementId,
     String arrangementType,
     Long shedulerJobId,
     String number,
     Date openingDate,
     Date closingDate,
     Date cancelDate,
     Long validityDuration,
     String cancellationReason,
     String status,
     Date interestCalculationDate,
     Double interestRate,
     Double coefficient,
     String coefficientAction,
     Double minimumInterestRate,
     Double minimumInterestRateCoefficient,
     String minimumInterestRateCoefficientAction,
     Double maximalInterestRate,
     Double maximalInterestRateCoefficient,
     String maximalInterestRateCoefficientAction
)
{}
