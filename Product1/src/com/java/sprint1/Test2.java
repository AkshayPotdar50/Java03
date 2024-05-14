package com.java.sprint1;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        String[] strArray = {"aksha", "hibernate", "spring", "microservices"};
        String longest;
        longest = Arrays.stream(strArray).reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).get();
        String shortest;
        shortest = Arrays.stream(strArray).reduce((str1, str2) -> str1.length() < str2.length() ? str1 : str2).get();

        System.out.println(longest + " " + shortest);
        System.out.println("********************************************************");

        String s1="akshay is good programmer";
        String converted=convertTheString(s1);
        System.out.println(converted);
    }
        //convert half of string in upper and lower

        public static String convertTheString(String str){
            int mid=str.length()/2;
            StringBuilder result= new StringBuilder();
            for(int i=0; i< str.length(); i++){
                 char ch=str.charAt(i);
                 if(i<mid){
                     result.append(Character.toUpperCase(ch));
                 }else{
                     result.append(Character.toLowerCase(ch));
                 }
            }
            return result.toString();

        }



    }


