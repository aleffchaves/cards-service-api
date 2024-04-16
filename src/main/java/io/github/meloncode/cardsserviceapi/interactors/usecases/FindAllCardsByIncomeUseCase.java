package io.github.meloncode.cardsserviceapi.interactors.usecases;

import io.github.meloncode.cardsserviceapi.interactors.converters.CardConverter;
import io.github.meloncode.cardsserviceapi.interactors.dtos.FoundCardModel;
import io.github.meloncode.cardsserviceapi.interactors.ports.FindAllCardsByIncomeInputPort;
import io.github.meloncode.cardsserviceapi.providers.CardProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FindAllCardsByIncomeUseCase implements FindAllCardsByIncomeInputPort {

    private final CardProvider cardProvider;

    @Override
    public List<FoundCardModel> execute(final BigDecimal income) {
        log.info("USE CASE LAYER - execute - FindAllCardsByIncomeUseCase");

        return this.cardProvider.findAllByIncomeLessThanEqual(income)
                .stream()
                .map(CardConverter::cardToFoundCardModel)
                .toList();
    }
}
