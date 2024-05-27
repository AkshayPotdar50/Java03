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

    //reverse the sting without using inbuilt function
    public static void reverseStringWithoutInbuilt(char[] s){
        int left=0;
        int right=s.length-1;

        while(left<right){
            //swap characters at left and right pointers
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;

            //move left pointer to right and right pointer to left
            left++;
            right--;

        }

    }

    public static void main(String[] args) {
        String sentense= "Reverse every word in sentense";
        String reversedSentense= reverseString(sentense);
        System.out.println(reversedSentense);
        System.out.println("**********************************************");

        String input="Hello world";
        System.out.println("Original string  "+input);
        char[] charArray=input.toCharArray();
        reverseStringWithoutInbuilt(charArray);
        String reversed= new String(charArray);
        System.out.println("Reversed string  "+reversed);
    }
}
