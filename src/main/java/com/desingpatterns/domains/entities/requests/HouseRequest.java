package com.desingpatterns.domains.entities.requests;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Bean;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class HouseRequest {
    @JsonProperty("bedrooms")
    private Integer bedrooms;
    @JsonProperty("bathrooms")
    private Integer bathrooms;
    @JsonProperty("hasGarden")
    private Boolean  hasGarden;
    @JsonProperty("hasGarage")
    private Boolean  hasGarage;
    @JsonProperty("hasSwimmingPool")
    private Boolean  hasSwimmingPool;
    @JsonProperty("hasFireplace")
    private Boolean  hasFireplace;
    @JsonProperty("hasBasement")
    private Boolean  hasBasement;
    @JsonProperty("hasAttic")
    private Boolean  hasAttic;
    @JsonProperty("hasSolarPanels")
    private Boolean  hasSolarPanels;
    @JsonProperty("address")
    private String address;

    public HouseRequest(Integer bedrooms, Integer bathrooms, Boolean hasGarden, Boolean hasGarage, Boolean hasSwimmingPool, Boolean hasFireplace, Boolean hasBasement, Boolean hasAttic, Boolean hasSolarPanels, String address) {
        super();
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.hasGarden = hasGarden;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasFireplace = hasFireplace;
        this.hasBasement = hasBasement;
        this.hasAttic = hasAttic;
        this.hasSolarPanels = hasSolarPanels;
        this.address = address;
    }

    public HouseRequest() {
        super();
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Boolean getHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(Boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public Boolean getHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(Boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public Boolean getHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(Boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public Boolean getHasFireplace() {
        return hasFireplace;
    }

    public void setHasFireplace(Boolean hasFireplace) {
        this.hasFireplace = hasFireplace;
    }

    public Boolean getHasBasement() {
        return hasBasement;
    }

    public void setHasBasement(Boolean hasBasement) {
        this.hasBasement = hasBasement;
    }

    public Boolean getHasAttic() {
        return hasAttic;
    }

    public void setHasAttic(Boolean hasAttic) {
        this.hasAttic = hasAttic;
    }

    public Boolean getHasSolarPanels() {
        return hasSolarPanels;
    }

    public void setHasSolarPanels(Boolean hasSolarPanels) {
        this.hasSolarPanels = hasSolarPanels;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
