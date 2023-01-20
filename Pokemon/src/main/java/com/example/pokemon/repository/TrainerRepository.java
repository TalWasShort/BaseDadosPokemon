package com.example.pokemon.repository;

import com.example.pokemon.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {

    Trainer findByTrainerName (String trainerName);
}
