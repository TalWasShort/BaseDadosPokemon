package com.example.pokemon.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "TRAINER")
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trainer")
    private long idTrainer;

    @Column(name = "trainer_name")
    private String trainerName;

    @ManyToOne
    @Column(name = "gender_id")
    private Gender gender;


    @Column(name = "password")
    private String password;
    public void setGender(Gender gender) {
        this.gender = gender;
    }




}
