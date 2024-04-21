package ru.Gik.Task5.dto;

import java.util.Date;

public record TppRefProductRegisterTypeDTO (
     Long internalId,
     String value,
     String registerTypeName,
     String productClassCode,
     Date registerTypeStartDate,
     Date registerTypeEndDate,
     String accountType
)
{}
