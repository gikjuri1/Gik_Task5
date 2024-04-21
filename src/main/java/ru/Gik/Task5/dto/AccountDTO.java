package ru.Gik.Task5.dto;

public record AccountDTO (
    Long id,
    Long accountPoolId,
    String accountNumber,
    Boolean bussy
){}

