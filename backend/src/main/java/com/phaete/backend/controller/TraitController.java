package com.phaete.backend.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phaete.backend.entities.Trait;
import com.phaete.backend.model.NotFoundException;
import com.phaete.backend.services.TraitService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


/**
 * This class is a REST controller for the trait endpoint.
 * It is responsible for handling requests to the /api/trait endpoint
 * and properly redirecting them to the TraitService.
 *
 * @author -St4n aka Phaete
 */
@Controller
@RequestMapping("/api/trait")
public class TraitController {

    private final TraitService traitService;

    public TraitController(TraitService traitService) {
        this.traitService = traitService;
    }

    /**
	 * Accepts a POST request on the /api/trait endpoint and creates a new trait entity in the database.
	 * <p>
	 * @param trait The trait entity to be created
	 * @return The newly created trait entity
	 */
    @PostMapping
    public Trait createTrait(@RequestBody Trait trait) {
        return traitService.createTrait(trait);
    }

    /**
	 * Accepts a GET request on the /api/trait endpoint and retrieves all trait entities.
	 * <p>
	 * @return A list of all trait entities.
	 */
    @GetMapping
    public List<Trait> retrieveAllTraits() {
        return traitService.findAllTraits();
    }
    
    /**
     * Accepts a GET request on the /api/trait/{id} endpoint and retrieves the trait entity with the specified id.
     *
     * @param id the id of the trait entity to be retrieved
     * @return the trait entity with the given id
     * @throws NotFoundException If no trait entity with the given Id was found in the database
     */
    @GetMapping("/{id}")
    public Trait retrieveTraitById(@PathVariable int id) throws NotFoundException {
        return traitService.findTraitById(id);
    }
    
    /**
     * Accepts a PUT request on the /api/trait/{id} endpoint and udpates the trait entity with the specified id.
     *
     * @param id The id of the trait entity to be updated
     * @param trait The updated trait entity
     * @return the updated trait entity
     * @throws NotFoundException If no trait entity with the given Id was found in the database
     */
    @PutMapping("/{id}")
    public Trait updateTraitById(@PathVariable int id, @RequestBody Trait newTrait) throws NotFoundException {
        traitService.findTraitById(id);
        return traitService.udpateTrait(id, newTrait);
    }

    /**
     * Accepts a DELETE request on the /api/trait/{id} endpoint and deletes the trait entity with the specified id from the database.
     *
     * @param id The id of the trait entity to be deleted
     * @return the id of the deleted trait entity
     * @throws NotFoundException If no trait entity with the given Id was found in the database
     */
    @DeleteMapping("/{id}")
    public int deleteTraitById(@PathVariable int id) throws NotFoundException {
        return traitService.deleteTrait(id);
    }
}
