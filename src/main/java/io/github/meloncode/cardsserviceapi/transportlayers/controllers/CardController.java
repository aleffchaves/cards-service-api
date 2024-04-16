package io.github.meloncode.cardsserviceapi.transportlayers.controllers;

import io.github.meloncode.cardsserviceapi.interactors.ports.CreateCardInputPort;
import io.github.meloncode.cardsserviceapi.interactors.ports.FindAllCardsByIncomeInputPort;
import io.github.meloncode.cardsserviceapi.transportlayers.converters.CardConverter;
import io.github.meloncode.cardsserviceapi.transportlayers.dtos.CreateCardRequest;
import io.github.meloncode.cardsserviceapi.transportlayers.dtos.FindCardByIncomeResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@RequestMapping("api/v1/cards")
@RestController
@RequiredArgsConstructor
public class CardController {

    private final CreateCardInputPort createCard;
    private final FindAllCardsByIncomeInputPort findAllCardsByIncome;

    @PostMapping
    public ResponseEntity<Void> createCard(@RequestBody final CreateCardRequest request) {
        log.info(STR."TRANSPORT LAYER - createCard - CardController - REQUEST: \{request}");

        final var createCardModel = CardConverter.createCardRequestToCreateCardModel(request);
        this.createCard.execute(createCardModel);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping(params = "income")
    public ResponseEntity<List<FindCardByIncomeResponse>> findAllCardsByIncome(@RequestParam BigDecimal income) {
        log.info(STR."TRANSPORT LAYER - findAllCardsByIncome - CardController - REQUEST: \{income}");

        final var findCardByIncomeResponseList = this.findAllCardsByIncome.execute(income)
                .stream()
                .map(CardConverter::foundCardModelToFindCardByIncomeResponse)
                .toList();

        return ResponseEntity.status(HttpStatus.OK).body(findCardByIncomeResponseList);
    }
}
