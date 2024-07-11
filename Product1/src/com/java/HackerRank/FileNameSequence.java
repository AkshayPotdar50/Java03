package com.java.HackerRank;

public class FileNameSequence {
    //Write a Java program to concatenate two strings without using the concatenation operator (+)
    public static void main(String[] args) {
        String str1="akshay";
        String str2="ashish";
        StringBuilder str3= new StringBuilder();
        str3.append(str1);
        str3.append(str2);

        String s=str3.toString();
        System.out.println(s);
        System.out.println("///*///////////*********/////////********//////");

        String str = "Hello, world! Hello, everyone! Hello, Hello!";
        String substring = "Hello";

        int count = countOccurances(str, substring);


        System.out.println("The substring \"" + substring + "\" occurs " + count + " times in the string.");

        System.out.println("****************//////////*********////////****");

        String originalString = "Hello, world! Hello, everyone! Hello, Hello!";
        String targetSubstring = "Hello";
        String replacementSubstring = "Hi";

        String resultString = replaceSubstring(originalString, targetSubstring, replacementSubstring);

        System.out.println("Original string: " + originalString);
        System.out.println("Modified string: " + resultString);

        System.out.println("///////////*******//////////********/////");

        String str4 = "apple,banana,orange,grape";
        String delimiter = ",";

        // Splitting the string based on the delimiter
        String[] substrings = splitString(str4, delimiter);

        // Printing the result
        System.out.println("Original string: " + str);
        System.out.println("Substrings:");
        for (String substring1 : substrings) {
            System.out.println(substring1);
        }
    }

    //Write a Java program to count the occurrences of a substring in a string.
    public static int countOccurances(String str, String substring){
        int count =0;
        int index=0;

        while((index=str.indexOf(substring, index)) != -1){
            count++;
            index+=substring.length();
        }
        return count;
    }

    public static String replaceSubstring(String str, String target, String replacement) {
        // Using the replaceAll method to replace all occurrences of the target substring
        return str.replaceAll(target, replacement);
    }

    public static String[] splitString(String str, String delimiter){
        return str.split(delimiter);
    }

    //Write a Java program to split a string into multiple substrings based on a delimiter.

}
