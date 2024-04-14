package io.github.meloncode.cardsserviceapi.interactors.ports;

import io.github.meloncode.cardsserviceapi.interactors.dtos.CreateCardModel;

public interface CreateCardInputPort {

    void execute(final CreateCardModel model);

}
