package com.phaete.backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.phaete.backend.entities.Source;
import com.phaete.backend.model.NotFoundException;
import com.phaete.backend.repositories.SourceRepository;

/**
 * Service class for managing {@link Source} entities.
 * It provides methods to interact with the {@link SourceRepository}
 * allowing for CRUD operations on Source objects.
 * <p>
 * Supported functions as per CRUD:
 * <ul>
 * 	<li> Creating new sources </li>
 * 	<li> Retrieving all sources </li>
 * 	<li> Retrieving sources by id </li>
 * 	<li> Updating sources by id </li>
 * 	<li> Deleting sources by id </li>
 * </ul>
 * <p>
 * The service acts as a bridge between the controller and the repository
 * and contains all business logic for the Source entity
 *
 * @author -St4n aka Phaete
 */
@Service
public class SourceService {

    private final SourceRepository sourceRepository;

    public SourceService(
        SourceRepository sourceRepository
    ) {
        this.sourceRepository = sourceRepository;
    }

    /**
     * Creates a new source and saves it to the database
     * 
     * @param source the Source to be saved to the database
     * @return the newly created source
     */
    public Source createSource(Source source) {
        return this.sourceRepository.save(source);
    }

    /**
     * Retrieves a list of all sources.
     * 
     * @return A list of all source entries in the database
     */
    public List<Source> findAllSources() {
        return this.sourceRepository.findAll();
    }

    /**
     * Retrieves a source by its id.
     * 
     * @param id the id of the source entry to be retrieved
     * @return the source entry with the given id
     * @throws NotFoundException if no source with the given id can be found
     */
    public Source findSourceById(int id) throws NotFoundException {
        return this.sourceRepository.findById(id).orElseThrow(() -> new NotFoundException("Could not find source with the id: " + id));
    }

    /**
     * Updates an existent source entity in the database
     * 
     * @param id the id of the source to be updated
     * @param source the source with the updated fields
     * @return the udpated source entity
     * @throws NotFoundException if no source with the given id can be found
     */
    public Source udpateSource(int id, Source source) throws NotFoundException {
        findSourceById(id);
        return this.sourceRepository.save(source);
    }

    /**
     * Deletes a source in the database
     * 
     * @param id the id of the source entry to be deleted
     * @return the source entry with the given id
     * @throws NotFoundException if no source with the given id can be found
     */
    public int deleteSource(int id) throws NotFoundException {
        Source sourceToDelete = findSourceById(id);
        this.sourceRepository.deleteById(id);
        return sourceToDelete.getId();
    }
}
