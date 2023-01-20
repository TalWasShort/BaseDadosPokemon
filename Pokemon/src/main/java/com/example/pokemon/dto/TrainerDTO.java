package com.example.pokemon.dto;


import com.example.pokemon.entity.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TrainerDTO {

    @NotBlank
    @NotNull
    private String trainerName;
    @NotBlank
    @NotNull
    private String password;
}
