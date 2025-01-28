package com.phaete.backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.phaete.backend.entities.Trait;
import com.phaete.backend.model.NotFoundException;
import com.phaete.backend.repositories.TraitRepository;

/**
 * Service class for managing {@link Trait} entities.
 * It provides methods to interact with the {@link TraitRepository}
 * allowing for CRUD operations on Source objects.
 * <p>
 * Supported functions as per CRUD:
 * <ul>
 * 	<li> Creating new traits </li>
 * 	<li> Retrieving all traits </li>
 * 	<li> Retrieving traits by id </li>
 * 	<li> Updating traits by id </li>
 * 	<li> Deleting traits by id </li>
 * </ul>
 * <p>
 * The service acts as a bridge between the controller and the repository
 * and contains all business logic for the Trait entity
 *
 * @author -St4n aka Phaete
 */
@Service
public class TraitService {

    private TraitRepository traitRepository;

    public TraitService(
        TraitRepository traitRepository
    ) {
        this.traitRepository = traitRepository;
    }

    /**
     * Creates a new trait and saves it to the database
     * 
     * @param trait the Trait to be saved to the database
     * @return the newly created trait
     */
    public Trait createTrait(Trait trait) {
        return this.traitRepository.save(trait);
    }

    /**
     * Retrieves a list of all traits.
     * 
     * @return A list of all trait entries in the database
     */
    public List<Trait> findAllTraits() {
        return this.traitRepository.findAll();
    }

    /**
     * Retrieves a trait by its id.
     * 
     * @param id the id of the trait entry to be retrieved
     * @return the trait entry with the given id
     * @throws NotFoundException if no trait with the given id can be found
     */
    public Trait findTraitById(int id) throws NotFoundException {
        return this.traitRepository.findById(id).orElseThrow(() -> new NotFoundException("Could not find trait with the id: " + id));
    }

    /**
     * Updates an existent trait entity in the database
     * 
     * @param id the id of the trait to be updated
     * @param trait the trait with the updated fields
     * @return the udpated trait entity
     * @throws NotFoundException if no trait with the given id can be found
     */
    public Trait udpateTrait(int id, Trait trait) throws NotFoundException {
        findTraitById(id);
        return this.traitRepository.save(trait);
    }

    /**
     * Deletes a trait in the database
     * 
     * @param id the id of the trait entry to be deleted
     * @return the trait entry with the given id
     * @throws NotFoundException if no trait with the given id can be found
     */
    public int deleteTrait(int id) throws NotFoundException {
        Trait traitToDelete = findTraitById(id);
        this.traitRepository.deleteById(id);
        return traitToDelete.getId();
    }
}
