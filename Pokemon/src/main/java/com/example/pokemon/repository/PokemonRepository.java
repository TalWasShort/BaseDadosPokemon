package com.example.pokemon.repository;


import com.example.pokemon.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface PokemonRepository  extends JpaRepository<Pokemon,Long > {

    Pokemon findByPokemonName(String pokemonName);


}
