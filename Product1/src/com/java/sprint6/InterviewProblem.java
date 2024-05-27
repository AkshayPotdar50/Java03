package com.java.sprint6;

import java.util.*;

/*problem statement
* Develop a Java function that identifies and returns the
*  largest group of anagrams from a given string of
* space-separated words. An anagram group is defined
*  as a collection of words that contain the same
*  characters in any order.*/
public class InterviewProblem {

    public static String[] findMaxAnagramGroup(String words){

        //split the input string into array of words
        String[] wordArray=words.split("\\s+");

        //create a map to hold group of anagrams
        Map<String, List<String>> anagramGroups= new HashMap<>();

        //iterate over each word
        for(String word: wordArray) {
            //convert the word into character array, sort it and convert back to string
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            //add the word to corrosponding anagram group
            anagramGroups.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }
            //find the latest anagram groups
            List<String> largestAnagramGroup= new ArrayList<>();
            for(List<String> group: anagramGroups.values()){
                if(group.size() >largestAnagramGroup.size()){
                    largestAnagramGroup= group;
                }
            }
            return largestAnagramGroup.toArray(new String[0]);



    }

    public static void main(String[] args) {
        String input="listen silent enlist inlets google gooegl";
        String[] result=findMaxAnagramGroup(input);
        System.out.println(Arrays.toString(result));
    }
}
