package com.phaete.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * An entity for a rulebook as source.
 *
 * It contains the following information about a rulebook:
 * <ul>
 *  <li> id - the id of the rulebook </li>
 *  <li> name - the name of the rulebook </li>
 *  <li> productPageUrl - the product page url of the rulebook </li>
 *  <li> releaseDate - the release date of the rulebook </li>
 * </ul>
 * 
 * @author -St4n aka Phaete
 */
@Entity
@Table(name = "source")
public class Source {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String productPageUrl;
    private String latestErrata;
    private String releaseDate;
    private String productLine;

    public Source(
        int id, 
        String name, 
        String productPageUrl, 
        String latestErrata, 
        String releaseDate,
        String productLine
    ) {
        this.id = id;
        this.name = name;
        this.productPageUrl = productPageUrl;
        this.latestErrata = latestErrata;
        this.releaseDate = releaseDate;
        this.productLine = productLine;
    }

    public Source() {
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

    public String getProductPageUrl() {
        return productPageUrl;
    }

    public void setProductPageUrl(String productPageUrl) {
        this.productPageUrl = productPageUrl;
    }

    public String getLatestErrata() {
        return latestErrata;
    }

    public void setLatestErrata(String latestErrata) {
        this.latestErrata = latestErrata;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((productPageUrl == null) ? 0 : productPageUrl.hashCode());
        result = prime * result + ((latestErrata == null) ? 0 : latestErrata.hashCode());
        result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
        result = prime * result + ((productLine == null) ? 0 : productLine.hashCode());
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
        Source other = (Source) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (productPageUrl == null) {
            if (other.productPageUrl != null)
                return false;
        } else if (!productPageUrl.equals(other.productPageUrl))
            return false;
        if (latestErrata == null) {
            if (other.latestErrata != null)
                return false;
        } else if (!latestErrata.equals(other.latestErrata))
            return false;
        if (releaseDate == null) {
            if (other.releaseDate != null)
                return false;
        } else if (!releaseDate.equals(other.releaseDate))
            return false;
        if (productLine == null) {
            if (other.productLine != null)
                return false;
        } else if (!productLine.equals(other.productLine))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Source [id=" + id + ", name=" + name + ", productPageUrl=" + productPageUrl + ", latestErrata="
                + latestErrata + ", releaseDate=" + releaseDate + ", productLine=" + productLine + "]";
    }
}
