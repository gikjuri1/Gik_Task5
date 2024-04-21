package ru.Gik.Task5.dto;

import java.util.Date;

public record TppProductDTO (
        Long id,
     Long productCodeId,
     Long clientId,
     String type,
     String number,
     Long priority,
     Date dateOfConclusion,
     Date startDateTime,
     Date endDateTime,
     Long days,
     Double penaltyRate,
     Double nso,
     Double thresholdAmount,
     String requisiteType,
     String interestRateType,
     Double taxRate,
     String reasoneClose,
     String state
)
{}
