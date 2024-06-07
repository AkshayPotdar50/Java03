package com.java.sprint7;

import java.util.stream.Collectors;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String s1="akshay is bad programmer";
        String result1=reverseWords(s1);
        System.out.println(result1);

        System.out.println(containsAlphanumericOnly(s1));
        System.out.println(containsOnlyDigit(s1));
        System.out.println(containsOnlyLetters(s1));
    }
    public static String reverseWords(String str){
        String[] words= str.split("\\s+");
        StringBuilder reversedSentense= new StringBuilder();

        for(String word: words){
            StringBuilder reversedWord= new StringBuilder(word).reverse();
            reversedSentense.append(reversedWord).append(" ");
        }
        return reversedSentense.toString().trim();
    }


    //sort the characters in string in alphabetical order
    public static String sortInAlphabetical(String str){
        return str.chars().sorted().mapToObj(c-> String.valueOf((char)c)).collect(Collectors.joining());
    }

    /*Write a Java program to check if a string contains only digits.
Write a Java program to check if a string contains only letters.*/
    public static boolean containsOnlyDigit(String str){
        return str.chars().allMatch(Character::isDigit);
    }

    public static boolean containsOnlyLetters(String str){
        return str.chars().allMatch(Character::isLetter);
    }

    public static boolean containsAlphanumericOnly(String str){
        return str.matches("[a-zA-Z0-9]+");
    }

    


}
