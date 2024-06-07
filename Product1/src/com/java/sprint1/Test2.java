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
        System.out.println("********************************");
        String reversed=reverseTheString(s1);
        System.out.println(reversed);

        System.out.println("************************************");
        String alternate=capitalizeEveryOther(s1);
        System.out.println(alternate);

        System.out.println("*********************************************");
        String vowelRemove =removeVowel(s1);
        System.out.println(vowelRemove);

        System.out.println("*************************************");
        String removeSpace=replaceSpacesWithUnderscore(s1);
        System.out.println(removeSpace);

        System.out.println("******************************************************");
        String capitalizeFirst =capitalizeFirstLetterOfEachWord(s1);
        System.out.println(capitalizeFirst);

        System.out.println("*******************************************");
        String removeCansonant=removeCansonant(s1);
        System.out.println(removeCansonant);
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

        //reverse the string using inbuilt function
    public static String reverseTheString(String str){
        StringBuilder result= new StringBuilder(str);
        return result.reverse().toString();
    }

    //write function to capitalize every other character
    public static String capitalizeEveryOther(String str){
        StringBuilder result= new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(i % 2 ==0){
                result.append(Character.toUpperCase(ch));
            }else{
                result.append(Character.toLowerCase(ch));
            }
        }
        return result.toString();
    }

    //remove vowels
    public static String removeVowel(String str){
        StringBuilder result= new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch =str.charAt(i);
            if(!("AEIOUaeiou".indexOf(ch) ==-1)){
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String removeCansonant(String str){
        StringBuilder result= new StringBuilder();
        for(char ch:str.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) !=-1|| !Character.isLetter(ch)){
                result.append(ch);
            }

        }
        return result.toString();
    }

    public static String replaceSpacesWithUnderscore(String str){
        return str.replace(' ', '_');
    }

    public static String capitalizeFirstLetterOfEachWord(String str){
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext=true;

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);

            if(Character.isWhitespace(ch)){
                result.append(ch);
                capitalizeNext=true;
            }else if(capitalizeNext){
                result.append(Character.toUpperCase(ch));
                capitalizeNext= false;
            }else{
                result.append(Character.toLowerCase(ch));
            }
        }
        return result.toString();


    }



    }


