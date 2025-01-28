package com.phaete.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phaete.backend.entities.Source;

/**
 * This interface provides basic CRUD operations for the {@link Source} entity.
 * It extends the {@link JpaRepository} interface and thereby provides
 * methods for creating, reading, updating and deleting sources.
 */
@Repository
public interface SourceRepository extends JpaRepository<Source, Integer>{

}
