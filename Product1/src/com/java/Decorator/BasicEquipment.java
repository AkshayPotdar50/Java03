package com.java.Decorator;

public class BasicEquipment implements Equipment{

    private String description;
    private double cost;

    public BasicEquipment(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }
/*The Decorator Pattern in Java is a structural design pattern that
 allows adding new functionality to an object dynamically at runtime
  without altering its structure, by wrapping it with a decorator
  class that implements the same interface.*/

    @Override
    public String getDiscription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
