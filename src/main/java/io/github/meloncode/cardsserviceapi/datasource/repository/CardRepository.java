package io.github.meloncode.cardsserviceapi.datasource.repository;

import io.github.meloncode.cardsserviceapi.datasource.models.CardData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardData, String> {

}
