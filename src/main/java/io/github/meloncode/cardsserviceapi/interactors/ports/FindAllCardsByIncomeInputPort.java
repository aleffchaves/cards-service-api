package io.github.meloncode.cardsserviceapi.interactors.ports;

import io.github.meloncode.cardsserviceapi.interactors.dtos.FoundCardModel;

import java.math.BigDecimal;
import java.util.List;

public interface FindAllCardsByIncomeInputPort {

    List<FoundCardModel> execute(final BigDecimal income);
}
