package ru.Gik.Task5.dto;

public record AccountPoolDTO (
    Long id,
    String branchCode,
    String currencyCode,
    String mdmCode,
    String priorityCode,
    String registryTypeCode
)
{}
