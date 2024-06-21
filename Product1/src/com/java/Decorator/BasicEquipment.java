package com.java.Decorator;

public class BasicEquipment implements Equipment{

    private String description;
    private double cost;

    public BasicEquipment(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }


    @Override
    public String getDiscription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
