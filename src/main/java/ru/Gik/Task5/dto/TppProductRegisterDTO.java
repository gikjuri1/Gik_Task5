package ru.Gik.Task5.dto;

public record TppProductRegisterDTO (
     Long id,
     Long productId,
     String type,
     Long account,
     String currencyCode,
     String state,
     String accountNumber
)
{}
