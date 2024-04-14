package io.github.meloncode.cardsserviceapi.datasource.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
@Table(name = "cards")
public final class CardData {

    @Id
    private final String id;

    private final String name;

    private final String brand;

    private final BigDecimal income;

    private final BigDecimal spendingLimit;
}
