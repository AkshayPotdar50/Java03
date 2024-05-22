package com.java.sprint5;

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

}
