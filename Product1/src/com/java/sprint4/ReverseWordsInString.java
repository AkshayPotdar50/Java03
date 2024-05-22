package com.java.sprint4;

public class ReverseWordsInString {
    public static String reverseString(String sentense){
        String[] words= sentense.split("\\s+");

        StringBuilder reversedSentense = new StringBuilder();

        for(String word: words){
            StringBuilder reversedWord= new StringBuilder(word);
            reversedWord.reverse();
            reversedSentense.append(reversedWord).append(" ");
        }
        return reversedSentense.toString().trim();

    }

    public static void main(String[] args) {
        String sentense= "Reverse every word in sentense";
        String reversedSentense= reverseString(sentense);
        System.out.println(reversedSentense);
    }
}
