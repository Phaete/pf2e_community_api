package com.phaete.backend.model;

/**
 * A Data Transfer Object for the {@link Source} entity.
 * It contains only the fields that are relevant for the frontend.
 *
 * @author -St4n aka Phaete
 */
public class SourceDTO {

    private String name;
    private String productPageUrl;
    private String releaseDate;
    private String productLine;
    private String sourceGroup;
    
    public SourceDTO(
        String name, String productPageUrl, String releaseDate, String productLine, String sourceGroup
    ) {
        this.name = name;
        this.productPageUrl = productPageUrl;
        this.releaseDate = releaseDate;
        this.productLine = productLine;
        this.sourceGroup = sourceGroup;
    }

    public SourceDTO() {
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
        SourceDTO other = (SourceDTO) obj;
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
        return "SourceDTO [name=" + name + ", productPageUrl=" + productPageUrl + ", releaseDate=" + releaseDate
                + ", productLine=" + productLine + ", sourceGroup=" + sourceGroup + "]";
    }
}
