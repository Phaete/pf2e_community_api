package com.phaete.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "source")
public class Source {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String productPageUrl;
    private String releaseDate;
    private String productLine;
    private String sourceGroup;
    
    public Source(String id, String name, String productPageUrl, String releaseDate, String productLine,
            String sourceGroup) {
        this.id = id;
        this.name = name;
        this.productPageUrl = productPageUrl;
        this.releaseDate = releaseDate;
        this.productLine = productLine;
        this.sourceGroup = sourceGroup;
    }

    public Source() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getSourceGroup() {
        return sourceGroup;
    }

    public void setSourceGroup(String sourceGroup) {
        this.sourceGroup = sourceGroup;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((productPageUrl == null) ? 0 : productPageUrl.hashCode());
        result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
        result = prime * result + ((productLine == null) ? 0 : productLine.hashCode());
        result = prime * result + ((sourceGroup == null) ? 0 : sourceGroup.hashCode());
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
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
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
        if (sourceGroup == null) {
            if (other.sourceGroup != null)
                return false;
        } else if (!sourceGroup.equals(other.sourceGroup))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Source [id=" + id + ", name=" + name + ", productPageUrl=" + productPageUrl + ", releaseDate="
                + releaseDate + ", productLine=" + productLine + ", sourceGroup=" + sourceGroup + "]";
    }
}
