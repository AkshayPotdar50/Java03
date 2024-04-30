package com.java.sprint1;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

    String [] strArray={"aksha", "hibernate", "spring", "microservices"};
    String longest="";
    longest = Arrays.stream(strArray).reduce((str1, str2)->str1.length()>str2.length() ? str1:str2).get();
    String shortest="";
    shortest=Arrays.stream(strArray).reduce((str1, str2)->str1.length()<str2.length() ?str1:str2).get();

        System.out.println(longest+" "+shortest);

        //convert half of string in upper and lower



    }
}
