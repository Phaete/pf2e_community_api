package com.phaete.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * An entity for a trait.
 * 
 * It contains the following information:
 * <ul>
 *  <li> id - the id of the trait </li>
 *  <li> name - the name of the trait </li>
 *  <li> description - the description of the trait </li>
 * </ul>
 * 
 * @author -St4n aka Phaete
 */
@Entity
@Table(name = "trait")
public class Trait {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "source_id")
    private Source source;

    public Trait(
        int id, 
        String name,
        String description
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Trait() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Trait other = (Trait) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Trait [id=" + id + ", name=" + name + ", description=" + description + "]";
    }
}
