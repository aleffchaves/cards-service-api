package io.github.meloncode.cardsserviceapi.transportlayers.dtos;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public final class CreateCardRequest {
    private final String name;
    private final String brand;
    private final BigDecimal income;
    private final BigDecimal limit;
}
