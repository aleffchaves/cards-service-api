package io.github.meloncode.cardsserviceapi.entities;

import io.github.meloncode.cardsserviceapi.entities.enums.Brand;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Card {
    private String id;
    private String name;
    private Brand brand;
    private BigDecimal income;
    private BigDecimal limit;
}
