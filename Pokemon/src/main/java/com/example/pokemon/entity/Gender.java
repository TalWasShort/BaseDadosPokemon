package com.example.pokemon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "gender")
public class Gender {

    @Id
    @Column(name = "id_gender")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idGender;

    @Column(name = "gender_type")
    private String genderType;

    @Column(name = "img_ling")
    private String imgLink;


}