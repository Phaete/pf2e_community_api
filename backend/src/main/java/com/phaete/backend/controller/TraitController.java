package com.phaete.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phaete.backend.entities.Trait;
import com.phaete.backend.services.TraitService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/api/trait")
public class TraitController {

    private final TraitService traitService;

    public TraitController(TraitService traitService) {
        this.traitService = traitService;
    }

    @PostMapping
    public Trait createTrait(@RequestBody Trait trait) {
        return traitService.createTrait(trait);
    }
    

}
