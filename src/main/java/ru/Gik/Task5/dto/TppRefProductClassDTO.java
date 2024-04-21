package ru.Gik.Task5.dto;

public record TppRefProductClassDTO (
     Long internalId,
     String value,
     String gbiCode,
     String gbiName,
     String productRowCode,
     String productRowName,
     String subclassCode,
     String subclassName
)
{}
