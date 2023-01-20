package com.example.pokemon.repository;


import com.example.pokemon.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

    @Override
    List<Card> findAll();
}
