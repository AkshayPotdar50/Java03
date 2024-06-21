package com.java.Decorator;

public class SelfOwnedEquipmentDecorator extends EquipmentDecorator{
    public SelfOwnedEquipmentDecorator(Equipment decoratedEquipment) {
        super(decoratedEquipment);
    }

    @Override
    public String getDiscription() {
        return decoratedEquipment.getDiscription()+" self-owned";
    }

    @Override
    public double getCost() {
        return decoratedEquipment.getCost();
    }
}
