package io.github.meloncode.cardsserviceapi.interactors.dtos;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public final class CreateCardModel {
    private final String name;
    private final String brand;
    private final BigDecimal income;
    private final BigDecimal limit;
}
