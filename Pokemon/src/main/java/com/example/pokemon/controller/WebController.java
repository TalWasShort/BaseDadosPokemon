package com.example.pokemon.controller;

import com.example.pokemon.dto.TrainerDTO;
import com.example.pokemon.entity.Trainer;
import com.example.pokemon.repository.CardRepository;
import com.example.pokemon.repository.PokemonRepository;
import com.example.pokemon.repository.TrainerRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    private final PokemonRepository pokemonRepository;
    private final TrainerRepository trainerRepository;
    private final CardRepository cardRepository;


    @Autowired

    public WebController(PokemonRepository pokemonRepository,
                         TrainerRepository trainerRepository,
                         CardRepository  cardRepository){

        this.pokemonRepository= pokemonRepository;
        this.trainerRepository = trainerRepository;
        this.cardRepository = cardRepository;
    }

    @GetMapping({"/", "/home"})
    public ModelAndView getHomePage() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("cardList", cardRepository.findAll());
        return mv;
    }
    @GetMapping("/login")
    public ModelAndView getLoginPage() {
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
    @GetMapping("/createaccount")
    public ModelAndView getCreateAccountPage() {
        ModelAndView mv = new ModelAndView("createaccount");
        return mv;
    }

    @GetMapping("/about")
    public ModelAndView getAboutPage() {
        ModelAndView mv = new ModelAndView("about");
        return mv;
    }
    @PostMapping("/loginWithUser")
    public ModelAndView postLoginWithUser(@Valid TrainerDTO trainer, ModelAndView mv, BindingResult bindingResult) {

        Trainer trainerFromRepository = trainerRepository.findByTrainerName(trainer.getTrainerName());

        mv.setViewName("login");
        return mv;
    }
}
