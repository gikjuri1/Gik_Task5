package ru.Gik.Task5.dto;

public record CSAccountReqDTO(
        Long instanceId,
        String registryTypeCode,
        String accountType,
        String currencyCode,
                String branchCode,
        String priorityCode,
                String mdmCode,
                String clientCode,
                String trainRegion,
                String counter,
                String salesCode
        ) {
}
