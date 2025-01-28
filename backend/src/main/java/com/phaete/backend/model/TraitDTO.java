package com.phaete.backend.model;

/**
 * A Data Transfer Object for the {@link Trait} entity.
 * It contains only the fields that are relevant for the frontend.
 *
 * @author -St4n aka Phaete
 */
public class TraitDTO {

    private String name;
    private String description;
    
    public TraitDTO(
        String name, String description
    ) {
        this.name = name;
        this.description = description;
    }

    public TraitDTO() {
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
        TraitDTO other = (TraitDTO) obj;
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
        return "TraitDTO [name=" + name + ", description=" + description + "]";
    }
}
