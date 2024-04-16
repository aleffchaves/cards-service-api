package io.github.meloncode.cardsserviceapi.datasource.datasources;

import io.github.meloncode.cardsserviceapi.datasource.coverters.CardConverter;
import io.github.meloncode.cardsserviceapi.datasource.repository.CardRepository;
import io.github.meloncode.cardsserviceapi.entities.Card;
import io.github.meloncode.cardsserviceapi.providers.CardProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class CardDataSource implements CardProvider {

    private final CardRepository cardRepository;

    @Override
    public void createCard(final Card card) {
        log.info("DATA SOURCE LAYER - create - CardDataSource");

        final var cardData = CardConverter.cardToCardData(card);
        this.cardRepository.save(cardData);
    }

    @Override
    public List<Card> findAllByIncomeLessThanEqual(final BigDecimal income) {
        log.info("DATA SOURCE LAYER - findAllByIncomeLessThanEqual - CardDataSource");

        return this.cardRepository.findAllByIncomeLessThanEqual(income)
                .stream()
                .map(CardConverter::cardDataToCard)
                .toList();
    }
}
