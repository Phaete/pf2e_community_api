package com.phaete.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phaete.backend.entities.Trait;

/**
 * This interface provides basic CRUD operations for the {@link Trait} entity.
 * It extends the {@link JpaRepository} interface and thereby provides
 * methods for creating, reading, updating and deleting traits.
 */
@Repository
public interface TraitRepository extends JpaRepository<Trait, Integer> {

}
