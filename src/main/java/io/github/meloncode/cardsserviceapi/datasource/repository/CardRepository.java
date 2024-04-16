package io.github.meloncode.cardsserviceapi.datasource.repository;

import io.github.meloncode.cardsserviceapi.datasource.models.CardData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<CardData, String> {

    List<CardData> findAllByIncomeLessThanEqual(final BigDecimal income);
}
