package com.example.pokemon.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "type_per_pokemon")
public class TypePerPokemon {



    //fazer dois tipos por pokemon? um secundário e um primário, o secundário pode ser nulo
    @Id
    @Column
    @ManyToOne
    private Type type;

    @Id
    @Column
    @ManyToOne
    private Pokemon pokemon;

}
