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
    @Column(name = "location_id")
    private Location location;

   @Column(name = "Trainer_Game")
   @ManyToOne
   private Trainer trainerGame;


    public void setLocation(Location location) {
        this.location = location;
    }

}
