package com.java.sprint1;

import java.util.Arrays;

public class Day1 implements Cloneable{

    String name;

    public Day1(String name) {
        this.name=name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        String str1="akshay";
        int a=findFirstRepetatingCharacter(str1);
        System.out.println(a);



        //theirs are two types of clonning we do in java
        //shallow clonning and deep clonning
        System.out.println("******************************");

        Day1 day1 =new Day1("akshay");
        Day1 day2 =day1;
        System.out.println(day1.name +" "+day2.name);
        System.out.println(day1==day2);
        System.out.println(day1.equals(day2));

        System.out.println("**************************************");

        //deep clonning

        Day1 day3 =new Day1("ashish");
        Day1 day4 =(Day1)day3.clone();
        System.out.println(day3.name+" "+day4.name);
        System.out.println(day3==day4);
        System.out.println(day3.equals(day4));



    }

    public static String formTheLargestNumber(String[] arr){
        Arrays.sort(arr, (num1, num2)->(num2+num1).compareTo(num1+num2));
StringBuilder str1 = new StringBuilder();
for(String s:arr){
    str1.append(s);
}
return str1.toString();
    }

    public static int findFirstRepetatingCharacter(String str){
        for(int i=0; i<str.length();i++){
            char c=str.charAt(i);
            if(str.indexOf(c) != str.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }


}
