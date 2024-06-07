package com.java.sprint7;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

class IncrementTask implements Runnable{

    private final ConcurrentHashMap<String, Integer> map;
    private final String key;

    public IncrementTask(ConcurrentHashMap<String, Integer> map, String key) {
        this.map = map;
        this.key = key;
    }

    @Override
    public void run() {


    }


}

public class LogicBuild {


    public static void main(String[] args) {
        int [] arr={1, 2, 3, 4, 5};
        int target=5;
       int [] unique= twoSum(arr, target);
        System.out.println(Arrays.toString(unique));

        System.out.println("****************time converter*********************");

        //time converter
        String originalTime="10:00 AM";
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("h:mm a");
        LocalTime time= LocalTime.parse(originalTime, formatter);

        //add 10 hours to time
        LocalTime newTime= time.plusHours(10);

        String convertedTime= newTime.format(formatter);

        System.out.println("original time: "+originalTime);
        System.out.println("new time :"+convertedTime);

        System.out.println("/////////concurrent hashmap///////////////");
        ConcurrentHashMap<String, Integer> currentMap=new ConcurrentHashMap<>();

        //create and start multiple threads to increment values
        for(int i=0; i<5; i++){

        }

    }

    /*Given a sorted array, remove the duplicates
    in place such that each element appears only
    once and return the new length.*/
    public static int removeDuplicate(int[] arr){
        if(arr.length ==0){
            return 0;
        }
        int j=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] !=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }

    /*Problem: Given an array of integers nums and an
     integer target, return indices of the two numbers
     such that they add up to target. You may assume
     that each input would have exactly one solution,
      and you may not use the same element twice. Return
      the answer in any order.*/

    /*Optimized Approach: Use a hash map to store the
     difference between the target and each element.
     Check if the current element exists in the hash map.*/

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{
                        map.get(complement), i
                };
            }
            map.put(nums[i], i );
        }
        throw new IllegalArgumentException("No such sum solution");
    }

    /*Given a string s, find the length of the longest substring
     without repeating characters.*/

    /*Optimized Approach: Use the sliding window technique with
     a hash map to track the characters and their indices. This
     allows us to keep track of the longest substring without
      repeating characters in linear time (O(n) complexity).*/

    public int lengthOfLongestSubstring(String s){
        Map<Character, Integer> map= new HashMap<>();
        int maxLength=0;
        int start=0;

        for(int end =0; end<s.length(); end++){
            char currentChar=s.charAt(end);

            if(map.containsKey(currentChar)){
                start=Math.max(start, map.get(currentChar)+1);
            }
            map.put(currentChar, end);
            maxLength=Math.max(maxLength, end-start+1);
        }
        return maxLength;

    }

    /*Write a function that takes a list of integers
     and returns a list containing only the unique
      elements in the order they first appeared.*/

    public static List<Integer> getUniqueElements(List<Integer> numbers){
       return numbers.stream().distinct().collect(Collectors.toList());
    }


    public static List<List<String>> groupAnagrams(List<String> strs){
        return new ArrayList<>(
                strs.stream()
                        .collect(Collectors.groupingBy(str->{
                            char[] chars=str.toCharArray();
                            Arrays.sort(chars);
                            return new String(chars);
                        }))
                        .values()
        );

    }

    //find factorial of given number by recursive approach
    public static int factorial(int n){
        if(n ==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
