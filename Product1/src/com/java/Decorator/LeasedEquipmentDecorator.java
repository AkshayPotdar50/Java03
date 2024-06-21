package com.java.Decorator;

public class LeasedEquipmentDecorator extends EquipmentDecorator{

    public LeasedEquipmentDecorator(Equipment decoratedEquipment) {
        super(decoratedEquipment);
    }

    @Override
    public String getDiscription() {
        return decoratedEquipment.getDiscription()+" leased";
    }

    @Override
    public double getCost() {
        return decoratedEquipment.getCost()+50.0;
    }
}
