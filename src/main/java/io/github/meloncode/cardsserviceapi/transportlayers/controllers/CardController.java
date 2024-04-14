package io.github.meloncode.cardsserviceapi.transportlayers.controllers;

import io.github.meloncode.cardsserviceapi.interactors.ports.CreateCardInputPort;
import io.github.meloncode.cardsserviceapi.transportlayers.converters.CardConverter;
import io.github.meloncode.cardsserviceapi.transportlayers.dtos.CreateCardRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("api/v1/cards")
@RestController
@RequiredArgsConstructor
public class CardController {

    private final CreateCardInputPort createCard;

    @PostMapping
    public ResponseEntity<Void> createCard(@RequestBody final CreateCardRequest request) {
        log.info(STR."TRANSPORT LAYER - createCard - CardController - REQUEST: \{request}");

        final var createCardModel = CardConverter.createCardRequestToCreateCardModel(request);
        this.createCard.execute(createCardModel);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
