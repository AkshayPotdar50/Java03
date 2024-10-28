package com.java.Decorator;

public class SolidPrinciples {
    /*
    *
    *
    * Single Responsibility Principle (SRP)
Every class should have only one reason to change, meaning it should only have one job or responsibility.
*
*
*
    *class InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        // logic to print invoice
    }
}

class Invoice {
    private double amount;

    public double calculateTotal() {
        // logic to calculate total amount
        return amount;
    }
}

    *
    *
    *
    *
    *
    *
    * Classes should be open for extension but closed for modification.
    *
    *abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

    *
    *
    *
    *
    * Subtypes must be substitutable for their base types.
    * class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird { }

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}

    *
    *
    *
    * Clients should not be forced to depend on interfaces they don't use.
    *
    * interface Printer {
    void printDocument();
}

interface Scanner {
    void scanDocument();
}

class MultiFunctionPrinter implements Printer, Scanner {
    public void printDocument() {
        System.out.println("Printing document");
    }

    public void scanDocument() {
        System.out.println("Scanning document");
    }
}

class SimplePrinter implements Printer {
    public void printDocument() {
        System.out.println("Printing document");
    }
}

    *
    *
    *
    *
    *
    *
    * High-level modules should not depend on low-level modules. Both should depend on abstractions.
    *
    * interface Keyboard {
    void type();
}

class WiredKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing on a wired keyboard");
    }
}

class Computer {
    private Keyboard keyboard;

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void type() {
        keyboard.type();
    }
}

public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new WiredKeyboard();
        Computer computer = new Computer(keyboard);
        computer.type();
    }
}

    *
    *
    *
    *
    * 
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */
}
