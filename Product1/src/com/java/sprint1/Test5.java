package com.java.sprint1;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        String str = "akshay";
        System.out.println("swap two strings");
        String str2 = "swapnil";
        str2 = str + str2;
        str = str2.substring(str.length());
        str2 = str2.substring(0, str2.length() - str.length());
        System.out.println(str2);
        System.out.println(str);
        System.out.println("***************************************");

        System.out.println("check string is palindrome or not");
        System.out.println(isPalindrome(str2));
        System.out.println("*************************************");

        String reversed = (new StringBuilder(str2)).reverse().toString();
        System.out.println(reversed);
        String str4 = "akshay is good perfoemer";
        int wordCount = (int)str4.chars().filter((c) -> c == 32).count() + 1;
        System.out.println(wordCount);
        System.out.println("***********************************");

        long vowelCount = str4.chars().filter((c) -> "aeiou".contains(String.valueOf((char)c))).distinct().count();
        System.out.println(vowelCount);
        System.out.println("***************************************");

        String str1 = "akshay";
        String str3 = "yaksha";
        String concatenated = str1 + str1;
        System.out.println(concatenated.contains(str3));
        System.out.println("******************************");
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[a-zA-Z0-9]", " ").toLowerCase();
        return str.equals((new StringBuilder(str)).reverse().toString());
    }

    public static boolean checkAnagram(String str1, String str2) {
        char[] charArray1 = str1.replaceAll("\\s", " ").toCharArray();
        char[] charArray2 = str2.replaceAll("\\s", " ").toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
