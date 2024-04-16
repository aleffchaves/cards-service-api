package io.github.meloncode.cardsserviceapi.providers;


import io.github.meloncode.cardsserviceapi.entities.Card;

import java.math.BigDecimal;
import java.util.List;

public interface CardProvider {

    void createCard(final Card card);

    List<Card>findAllByIncomeLessThanEqual(final BigDecimal income);
}
