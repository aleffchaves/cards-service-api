package io.github.meloncode.cardsserviceapi.interactors.converters;

import io.github.meloncode.cardsserviceapi.entities.Card;
import io.github.meloncode.cardsserviceapi.interactors.dtos.FoundCardModel;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CardConverter {

    public static FoundCardModel cardToFoundCardModel(final Card card) {
        return FoundCardModel
                .builder()
                .id(card.getId())
                .name(card.getName())
                .brand(card.getBrand().name())
                .limit(card.getLimit())
                .income(card.getIncome())
                .build();
    }
}
