package com.example.pokemon.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "JOGADA")
public class Jogada {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "JOGADA_ID")
    private Long jogadaId;

    @Column(name = "DESCRICPTION_JOGADA")
    private String descriptionJogada;


    @ManyToOne
    @Column(name = "GAME")
    private Game game;

}