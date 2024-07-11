package com.java.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapIterator {

    public static void main(String[] args) {
        // Sample HashMap with 250 string values
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < 250; i++) {
            hashMap.put(i, "Value " + i);
        }

        List<String> valuesList = iterateHashMap(hashMap);

        // Print stored values as different variables
        for (int i = 0; i < valuesList.size(); i++) {
            System.out.println("variable" + (i + 1) + ": " + valuesList.get(i));
        }
    }

    public static List<String> iterateHashMap(HashMap<Integer, String> hashMap) {
        // Create a list to store the values
        List<String> valuesList = new ArrayList<>();

        // Get the iterator
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();

        // Iterate over the HashMap using the iterator
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            // Retrieve each value and add it to the list
            valuesList.add(entry.getValue());
        }
        return valuesList;
    }
}

