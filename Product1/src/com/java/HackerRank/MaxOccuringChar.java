package com.java.HackerRank;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {
    public static void main(String[] args) {
        String str="sample string for finding maximum character";

        //ctreate a hashmap to strore character frequencies

        Map<Character, Integer> charcounting= new HashMap<>();

        //count the frequency of ech character in string

        for(char ch:str.toCharArray()){
            charcounting.put(ch, charcounting.getOrDefault(ch, 0)+1);

        }

        //find the character with maximum frequency
        char maxchar=' ';
        int maxcount=0;
        for(Map.Entry<Character, Integer> entry :charcounting.entrySet()){
            if(entry.getValue() >maxcount){
                maxchar= entry.getKey();
                maxcount= entry.getValue();

            }
        }

        System.out.println("maximum occuring character:"+maxchar);
        System.out.println("frequency"+maxcount);
    }
}
