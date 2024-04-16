package io.github.meloncode.cardsserviceapi.transportlayers.converters;

import io.github.meloncode.cardsserviceapi.interactors.dtos.CreateCardModel;
import io.github.meloncode.cardsserviceapi.interactors.dtos.FoundCardModel;
import io.github.meloncode.cardsserviceapi.transportlayers.dtos.CreateCardRequest;
import io.github.meloncode.cardsserviceapi.transportlayers.dtos.FindCardByIncomeResponse;
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

    public static FindCardByIncomeResponse foundCardModelToFindCardByIncomeResponse(final FoundCardModel cardModel) {
        return FindCardByIncomeResponse.builder()
                .id(cardModel.getId())
                .name(cardModel.getName())
                .brand(cardModel.getBrand())
                .income(cardModel.getIncome())
                .limit(cardModel.getLimit())
                .build();
    }
}
