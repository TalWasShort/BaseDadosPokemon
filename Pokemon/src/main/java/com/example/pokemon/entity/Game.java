package com.example.pokemon.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_game")
    private long idGame;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    //criar uma coluna jogada em vez de uma classe


    public void setLocation(Location location) {
        this.location = location;
    }

}
