package com.java.sprint7;

import java.util.HashMap;
import java.util.Map;

public class RemoveWhteSpaces {
    public static void main(String[] args) {
        String s1="akshay is bad coder";
        String result=removeWhiteSpace(s1);
        System.out.println(result);
        System.out.println("******************************");
        char c=findFirstNonRepeatingCharacter(s1);
        System.out.println(c);

        Map<Character, Integer> charcount=findCharacterFreq(s1);
        for(Map.Entry<Character, Integer> entry :charcount.entrySet()){
            System.out.println(" "+entry.getKey()+" : "+ entry.getValue());
        }
    }

    public static String removeWhiteSpace(String str){
        return str.replaceAll("\\s+", "");
    }

    public static char findFirstNonRepeatingCharacter(String str){
        Map<Character, Integer> charCountMap= new HashMap<>();

        //count occurance of each character
        for(char c:str.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
        }

        //find the first non repeating character
        for(char c:str.toCharArray()){
            if(charCountMap.get(c) ==1){
                return c;
            }
        }
        return '\0';
    }

    //counting occurance of each character in string
    public static Map<Character, Integer> findCharacterFreq(String str){
        Map<Character, Integer> charcount = new HashMap<>();

        for(char c:str.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                charcount.put(c, charcount.getOrDefault(c, 0)+1);
            }
        }
        return charcount;
    }

    /*Write a Java program to find the index of the first occurrence of a character in a string.
Write a Java program to find the index of the last occurrence of a character in a string.*/

    public static int findOccuranceOfCharacter(String str){
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                return i;
            }
        }

        return -1;

        /*for finding last occurance of character
        * for(int i=str.length()-1; i>=0; i--){
        * char ch =str.charAt(i);
        * if(str.indexOf(ch) ==str.lastIndexOf(ch){
        * return i;
        * }
        * }
        * return-1;*/

    }


}
