package io.github.meloncode.cardsserviceapi.interactors.usecases;

import io.github.meloncode.cardsserviceapi.entities.Card;
import io.github.meloncode.cardsserviceapi.entities.enums.Brand;
import io.github.meloncode.cardsserviceapi.interactors.dtos.CreateCardModel;
import io.github.meloncode.cardsserviceapi.interactors.ports.CreateCardInputPort;
import io.github.meloncode.cardsserviceapi.providers.CardProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateCardUseCase implements CreateCardInputPort {

    private final CardProvider cardProvider;

    @Override
    public void execute(final CreateCardModel model) {
        log.info("USE CASE LAYER - execute - CreateCardUseCase");

        final var card = this.buildNewCard(model);
        this.cardProvider.createCard(card);
    }

    private Card buildNewCard(final CreateCardModel model) {
        return Card.builder()
            .id(UUID.randomUUID().toString())
            .name(model.getName())
            .brand(Brand.valueOf(model.getBrand()))
            .income(model.getIncome())
            .limit(model.getLimit())
            .build();
    }
}
