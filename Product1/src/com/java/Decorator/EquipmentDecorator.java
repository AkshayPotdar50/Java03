package com.java.Decorator;

public abstract class EquipmentDecorator implements Equipment{

    protected Equipment decoratedEquipment;

    public EquipmentDecorator(Equipment decoratedEquipment) {
        this.decoratedEquipment = decoratedEquipment;
    }


    @Override
    public String getDiscription() {
        return decoratedEquipment.getDiscription();
    }

    @Override
    public double getCost() {
        return decoratedEquipment.getCost();
    }
}
