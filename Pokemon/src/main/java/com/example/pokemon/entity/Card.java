package com.example.pokemon.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_card")
    private long id_card;

    @Column(name = "edition")
    private int edition;

    @Column(name = "hp")
    private int hp;

    @Column(name = "attack")
    private int attack;

    @Column(name = "defense")
    private int defense;

    @Column(name = "sp_attack")
    private int spAttack;

    @Column(name = "sp_defese")
    private int spDefense;

    @Column(name = "speed")
    private int string;

    @Column(name = "img_link")
    private String imgLink;

    @Column(name = "card_name")
    private String cardName;

    @ManyToOne
    @Column(name = "pokemon")
    private Pokemon pokemon;
}
