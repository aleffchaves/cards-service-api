package io.github.meloncode.cardsserviceapi.transportlayers.converters;

import io.github.meloncode.cardsserviceapi.interactors.dtos.CreateCardModel;
import io.github.meloncode.cardsserviceapi.transportlayers.dtos.CreateCardRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CardConverter {

    public static CreateCardModel createCardRequestToCreateCardModel(final CreateCardRequest request) {
        return CreateCardModel.builder()
                .name(request.getName())
                .brand(request.getBrand())
                .income(request.getIncome())
                .limit(request.getLimit())
                .build();
    }
}
