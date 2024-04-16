package io.github.meloncode.cardsserviceapi.interactors.dtos;

import io.github.meloncode.cardsserviceapi.entities.enums.Brand;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class FoundCardModel {
    private String id;
    private String name;
    private String brand;
    private BigDecimal income;
    private BigDecimal limit;
}
