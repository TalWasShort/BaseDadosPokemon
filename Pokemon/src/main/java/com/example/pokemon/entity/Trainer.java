package com.example.pokemon.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "trainer")
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trainer")
    private long idTrainer;

    @Column(name = "trainer_name")
    private String trainerName;

    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender gender;

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
