package com.desingpatterns.domains.entities;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.StringJoiner;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class House {
    private Integer bedrooms;
    private Integer bathrooms;
    private Boolean  hasGarden;
    private Boolean  hasGarage;
    private Boolean  hasSwimmingPool;
    private Boolean  hasFireplace;
    private Boolean  hasBasement;
    private Boolean  hasAttic;
    private Boolean  hasSolarPanels;
    private String address;
    private House() {}

    public Integer getBedrooms() {
        return bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public Boolean  hasGarden() {
        return hasGarden;
    }

    public Boolean  hasGarage() {
        return hasGarage;
    }

    public Boolean  hasSwimmingPool() {
        return hasSwimmingPool;
    }

    public Boolean  hasFireplace() {
        return hasFireplace;
    }

    public Boolean  hasBasement() {
        return hasBasement;
    }

    public Boolean  hasAttic() {
        return hasAttic;
    }

    public Boolean  hasSolarPanels() {
        return hasSolarPanels;
    }

    public String getAddress() {
        return address;
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

    @Override
    public String toString() {
        return new StringJoiner(", ", House.class.getSimpleName() + "[", "]")
                .add("bedrooms=" + bedrooms)
                .add("bathrooms=" + bathrooms)
                .add("hasGarden=" + hasGarden)
                .add("hasGarage=" + hasGarage)
                .add("hasSwimmingPool=" + hasSwimmingPool)
                .add("hasFireplace=" + hasFireplace)
                .add("hasBasement=" + hasBasement)
                .add("hasAttic=" + hasAttic)
                .add("hasSolarPanels=" + hasSolarPanels)
                .add("address='" + address + "'")
                .toString();
    }
    public static class BuilderHouse {
        private House house;

        public BuilderHouse() {
            this.house = new House();
        }

        public BuilderHouse bedrooms(Integer bedrooms) {
            this.house.bedrooms = bedrooms;
            return this;
        }

        public BuilderHouse bathrooms(Integer bathrooms) {
            this.house.bathrooms = bathrooms;
            return this;
        }

        public BuilderHouse hasGarden(Boolean  hasGarden) {
            this.house.hasGarden = hasGarden;
            return this;
        }

        public BuilderHouse hasGarage(Boolean  hasGarage) {
            this.house.hasGarage = hasGarage;
            return this;
        }

        public BuilderHouse hasSwimmingPool(Boolean  hasSwimmingPool) {
            this.house.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public BuilderHouse hasFireplace(Boolean  hasFireplace) {
            this.house.hasFireplace = hasFireplace;
            return this;
        }

        public BuilderHouse hasBasement(Boolean  hasBasement) {
            this.house.hasBasement = hasBasement;
            return this;
        }

        public BuilderHouse hasAttic(Boolean  hasAttic) {
            this.house.hasAttic = hasAttic;
            return this;
        }

        public BuilderHouse hasSolarPanels(Boolean  hasSolarPanels) {
            this.house.hasSolarPanels = hasSolarPanels;
            return this;
        }

        public BuilderHouse address(String address) {
            this.house.address = address;
            return this;
        }

        public House build() {
            // Realiza alguna validación antes de construir, si es necesario
            return this.house;
        }
    }
}
