package com.java.sprint1;

import java.util.HashMap;

class Myclass {
    private int id;
    private String name;

    public Myclass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Myclass other = (Myclass) obj;


        return id == other.id && name.equals(other.name);

    }
}
    public class Day2 {
        //Q. can we use class as key in hashmap in java
    /*
    * In Java, using a class as a key in a hashmap is indeed possible.
    * However, there are a few things to consider:

Hashing and Equality: When you use an object as a key in a hashmap,
* Java uses the hashCode() and equals() methods to determine equality
*  and generate the hash code. So, if you want to use a class as a key,
*  you need to override these methods in that class to ensure correct behavior.
Immutability: It's generally recommended to use immutable objects as keys in a
*  hashmap to prevent unexpected behavior. If the key object changes after being
*  used in the hashmap, it might not be retrievable using the same key.*/
        public static void main(String[] args) {
            HashMap<Myclass, String> map = new HashMap<>();

            Myclass key1 = new Myclass(1, "Key1");
            Myclass key2 = new Myclass(2, "Key2");

            map.put(key1, "Value1");
            map.put(key2, "Value2");

            System.out.println(map.get(key1)); // Output: Value1

        }

    }

