package com.java.sprint7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        String str= "Java programmer remove vowels";
        System.out.println(isPangram(str));

        System.out.println("**********************************");
        String result =removeVowels(str);
        System.out.println(result);
        System.out.println("*****************************************");

        String result1 =removeDuplicate(str);
        System.out.println(result1);
    }


    public static String removeVowels(String s1){
        return s1.replaceAll("[aeiouAEIOU]", "");

    }

    public static boolean isPangram(String input){
        input=input.toLowerCase();

        Set<Character> alphabetSet= new HashSet<>();

        for(int i=0; i<input.length(); i++){
            char ch=input.charAt(i);

            if(Character.isLetter(ch)){
                alphabetSet.add(ch);
            }
        }
        return alphabetSet.size() ==26;
    }

    /*Write a Java program to remove all duplicate characters from a string.*/
    public static String removeDuplicate(String str){
        Set<Character> set1= new HashSet<>();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(!set1.contains(ch)){
                set1.add(ch);
                result.append(ch);

            }
        }
        return result.toString();
    }

    public static String removeDuplicate1(String str){
        return str.chars()
                .distinct()
                .mapToObj(c->(char)c)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }



}



/*SELECT FROM EMPLOYEE.DEPT WHERE (SELECT DEPT.SALARY.MAX)*/