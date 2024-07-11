package com.java.sprint9.transient1;

import java.io.*;

public class TransientExample implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final int regularInt;
    private final transient int transientInt;
    private final String regularString;
    private final transient String transientString;

    public TransientExample(int regularInt, int transientInt, String regularString, String transientString) {
        this.regularInt = regularInt;
        this.transientInt = transientInt;
        this.regularString = regularString;
        this.transientString = transientString;
    }

    @Override
    public String toString() {
        return "TransientExample{" +
                "regularInt=" + regularInt +
                ", transientInt=" + transientInt +
                ", regularString='" + regularString + '\'' +
                ", transientString='" + transientString + '\'' +
                '}';
    }

    public static void main(String[] args) {
        TransientExample example = new TransientExample(123, 456, "RegularString", "TransientString");

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("example.ser"))) {
            oos.writeObject(example);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("example.ser"))) {
            TransientExample deserializedExample = (TransientExample) ois.readObject();
            System.out.println("Deserialized Example: " + deserializedExample);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

