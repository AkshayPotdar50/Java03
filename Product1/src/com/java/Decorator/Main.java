package com.java.Decorator;

public class Main {
    public static void main(String[] args) {
        Equipment equipment= new BasicEquipment("Excavator", 1000.0);
        System.out.println(equipment.getDiscription()+"costs $"+equipment.getCost());

        Equipment leasedEquipment = new LeasedEquipmentDecorator(equipment);
        System.out.println(leasedEquipment.getDiscription() + " costs $" + leasedEquipment.getCost());

        Equipment selfOwnedEquipment = new SelfOwnedEquipmentDecorator(equipment);
        System.out.println(selfOwnedEquipment.getDiscription() + " costs $" + selfOwnedEquipment.getCost());
    }
}
