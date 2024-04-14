package io.github.meloncode.cardsserviceapi.providers;


import io.github.meloncode.cardsserviceapi.entities.Card;

public interface CardProvider {

    void createCard(final Card card);
}
