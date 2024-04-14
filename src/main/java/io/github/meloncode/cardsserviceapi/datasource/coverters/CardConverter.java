package io.github.meloncode.cardsserviceapi.datasource.coverters;

import io.github.meloncode.cardsserviceapi.datasource.models.CardData;
import io.github.meloncode.cardsserviceapi.entities.Card;
import io.github.meloncode.cardsserviceapi.entities.enums.Brand;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CardConverter {

    public static CardData cardToCardData(final Card card) {
        return CardData.builder()
                .id(card.getId())
                .name(card.getName())
                .brand(card.getBrand().name())
                .income(card.getIncome())
                .spendingLimit(card.getLimit())
                .build();
    }

    public static Card cardDataToCard(final CardData cardData) {
        return Card.builder()
                .id(cardData.getId())
                .name(cardData.getName())
                .brand(Brand.valueOf(cardData.getBrand()))
                .income(cardData.getIncome())
                .limit(cardData.getSpendingLimit())
                .build();
    }
}
