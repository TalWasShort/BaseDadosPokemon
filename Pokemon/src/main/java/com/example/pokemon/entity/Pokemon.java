package com.example.pokemon.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name="pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pokemon")
    private long idPokemon;

    @Column(name = "pokemon_name")
    private String pokemonName;

    @Column(name = "generation")
    private int generation;

    @Column(name = "legendary")
    private boolean legendary;
}
