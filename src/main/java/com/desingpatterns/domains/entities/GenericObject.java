package com.desingpatterns.domains.entities;

public class GenericObject implements IPrototype {
    private String name;
    private Double price;

    public GenericObject(GenericObject genericObject) {
        this.name = genericObject.getName();
        this.price = genericObject.getPrice();
    }

    public GenericObject(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public GenericObject() {
    }

    @Override
    public IPrototype clone() {
        return new GenericObject(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
