package com.java.HackerRank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test56 {

    public static void iterateHashMap(HashMap<Integer, String> hashMap) {
        // Iterate over the HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            // Retrieve each value
            String value = entry.getValue();

            // Perform your operation with the value
            System.out.println("Processing value: " + value);
        }
    }

    public static void iterateHashMap2(HashMap<Integer, String> hashMap) {
        // Get the iterator
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();

        // Iterate over the HashMap using the iterator
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            // Retrieve each value
            String value = entry.getValue();

            // Perform your operation with the value
            System.out.println("Processing value: " + value);
        }
    }
}
