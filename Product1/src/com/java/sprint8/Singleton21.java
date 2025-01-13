package com.java.sprint8;

public class Singleton21 {

    // Static block is executed when the class is loaded into memory.
    static {
        System.out.println("this is static block");
    }

    // Private static instance to hold the single instance of the class.
    private static Singleton21 instance;

    // Public method to provide global access to the instance.
    // Implements lazy initialization to create the instance only when needed.
    public static Singleton21 getInstance() {
        if (instance == null) {
            // Create the single instance if it does not already exist.
            instance = new Singleton21();
        }
        return instance;
    }

    // Private constructor to prevent direct instantiation from other classes.
    private Singleton21() {
    }
}

// Another Singleton implementation using eager initialization.
class Singleton {

    // Static block is executed when the class is loaded into memory.
    static {
        System.out.println("static block 2");
    }

    // Private static instance initialized eagerly at the time of class loading.
    private static volatile Singleton instance = new Singleton();

    // Public method to provide global access to the instance.
    public static Singleton Instance() {
        return instance;
    }

    // Private constructor to prevent direct instantiation from other classes.
    private Singleton() {
    }
}

// Main class to test the Singleton implementations.
class Main {
    public static void main(String[] args) {
        // Access Singleton21
        System.out.println("Accessing Singleton21:");
        Singleton21 singleton21 = Singleton21.getInstance(); // First call to getInstance creates the instance.
        Singleton21 anotherSingleton21 = Singleton21.getInstance(); // Subsequent calls return the same instance.
        System.out.println("Singleton21 instance: " + singleton21);
        System.out.println("Another Singleton21 instance: " + anotherSingleton21);

        // Access Singleton
        System.out.println("\nAccessing Singleton:");
        Singleton singleton = Singleton.Instance(); // Instance is already created during class loading.
        Singleton anotherSingleton = Singleton.Instance(); // Returns the same instance.
        System.out.println("Singleton instance: " + singleton);
        System.out.println("Another Singleton instance: " + anotherSingleton);
    }
}


