package com.java.sprint5;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the string");
        String s1= scanner.next();
        System.out.println(palindrome(s1));

    }

    public static boolean palindrome(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) !=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String s1, String s2){
        char[] arr1=s1.replaceAll("//s", " ").toCharArray();
        char[]arr2=s2.replaceAll("//s", " ").toCharArray();
        Arrays.sort(arr2);
        Arrays.sort(arr1);
        return Arrays.equals(arr1, arr2);
    }

}
