package com.java.HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayMode {
    /*mode of elements in an
     array in Java, we need to count
      the frequency of each element and then
       find the element(s) with the highest frequency.*/

    public static void main(String[] args) {
        int[] arr={10, 2, 5, 3, 9, 1, 6, 4, 8, 7, 5, 5, 6};

        //count the frequency of element
        Map<Integer, Long> frequencyMap=new HashMap<>();
        IntStream.of(arr).forEach(num-> frequencyMap.put(num, frequencyMap.getOrDefault(num, 0L)));
        OptionalInt maxFrequency=frequencyMap.values().stream().mapToInt(Long::intValue).max();

        //find the mode
        if(maxFrequency.isPresent()){
            int maxfreq=maxFrequency.getAsInt();
            System.out.println("modes of the array:");
            frequencyMap.entrySet().stream()
                    .filter(entry->entry.getValue() ==maxfreq)
                    .forEach(entry-> System.out.println(entry.getKey()+" frequency"+entry.getValue()));
        }else{
            System.out.println("no mode found");
        }
    }
}
