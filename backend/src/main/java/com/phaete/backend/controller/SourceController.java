package com.phaete.backend.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phaete.backend.entities.Source;
import com.phaete.backend.model.NotFoundException;
import com.phaete.backend.services.SourceService;

/**
 * 
 */
@Controller
@RequestMapping("/api/source")
public class SourceController {

    private final SourceService sourceService;

    public SourceController(SourceService sourceService) {
        this.sourceService = sourceService;
    }

    /**
	 * Accepts a POST request on the /api/source endpoint and creates a new source entity in the database.
	 * <p>
	 * @param source The source entity to be created
	 * @return The newly created source entity
	 */
    @PostMapping
    public Source createSource(@RequestBody Source source) {
        return sourceService.createSource(source);
    }

    /**
	 * Accepts a GET request on the /api/source endpoint and retrieves all source entities.
	 * <p>
	 * @return A list of all source entities.
	 */
    @GetMapping
    public List<Source> retrieveAllSources() {
        return sourceService.findAllSources();
    }
    
    /**
     * Accepts a GET request on the /api/source/{id} endpoint and retrieves the source entity with the specified id.
     *
     * @param id the id of the source entity to be retrieved
     * @return the source entity with the given id
     * @throws NotFoundException If no source entity with the given Id was found in the database
     */
    @GetMapping("/{id}")
    public Source retrieveSourceById(@PathVariable int id) throws NotFoundException {
        return sourceService.findSourceById(id);
    }
    
    /**
     * Accepts a PUT request on the /api/source/{id} endpoint and udpates the source entity with the specified id.
     *
     * @param id The id of the source entity to be updated
     * @param source The updated source entity
     * @return the updated source entity
     * @throws NotFoundException If no source entity with the given Id was found in the database
     */
    @PutMapping("/{id}")
    public Source updateSourceById(@PathVariable int id, @RequestBody Source newSource) throws NotFoundException {
        sourceService.findSourceById(id);
        return sourceService.udpateSource(id, newSource);
    }

    /**
     * Accepts a DELETE request on the /api/source/{id} endpoint and deletes the source entity with the specified id from the database.
     *
     * @param id The id of the source entity to be deleted
     * @return the id of the deleted source entity
     * @throws NotFoundException If no source entity with the given Id was found in the database
     */
    @DeleteMapping("/{id}")
    public int deleteSourceById(@PathVariable int id) throws NotFoundException {
        return sourceService.deleteSource(id);
    }
}
