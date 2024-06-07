package com.java.sprint8;

public class Singleton21{

    static {
        System.out.println("this is static block");
    }

    private static Singleton21 instance;

    public static Singleton21 getInstance(){
        if(instance==null){
            instance = new Singleton21();
        }
        return instance;
    }

    private Singleton21() {
    }
}

class Singleton{

    static{
        System.out.println("static block 2");
    }
    private static volatile Singleton instance= new Singleton();
    public static Singleton Instance(){
        return instance;
    }

    private Singleton() {
    }
}

class Main {
    public static void main(String[] args) {
        // Access Singleton21
        System.out.println("Accessing Singleton21:");
        Singleton21 singleton21 = Singleton21.getInstance();
        Singleton21 anotherSingleton21 = Singleton21.getInstance();
        System.out.println("Singleton21 instance: " + singleton21);
        System.out.println("Another Singleton21 instance: " + anotherSingleton21);

        // Access Singleton
        System.out.println("\nAccessing Singleton:");
        Singleton singleton = Singleton.Instance();
        Singleton anotherSingleton = Singleton.Instance();
        System.out.println("Singleton instance: " + singleton);
        System.out.println("Another Singleton instance: " + anotherSingleton);
    }
}

