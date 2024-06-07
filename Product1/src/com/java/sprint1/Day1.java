package com.java.sprint1;

import java.util.Arrays;

public class Day1 implements Cloneable {

    String name;

    public Day1(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        String str1 = "akshay";
        int a = findFirstRepetatingCharacter(str1);//this will return index of a
        System.out.println(a);
        int b = findFirstNonReapeating(str1);//this will return index of k
        System.out.println(b);

        System.out.println("**********************************************");

        String[] arr = {"1", "2", "3", "4", "5"};

        String smallest = formTheSmallestNumber(arr);
        System.out.println("smallest number" + smallest);
        String largest = formTheLargestNumber(arr);
        System.out.println("largest number" + largest);


        //theirs are two types of clonning we do in java
        //shallow clonning and deep clonning
        /*Cloning in Java
Cloning in Java is the process of creating an exact copy of an object. There are two types of cloning:

Shallow Cloning
Deep Cloning
Shallow cloning creates a new instance of the object and copies all the fields to the new instance.
However, if the original object contains references to other objects, the references are copied rather
 than the objects themselves. This means that both the original and the clone will reference the same
  sub-objects.

Deep Cloning creates a new instance of the object and also creates new instances of any objects referenced
 by the original object. This means that all the sub-objects are recursively copied, ensuring that the clone
 is entirely independent of the original object.*/
        System.out.println("******************************");
//shallow cloning
        Day1 day1 = new Day1("akshay");
        Day1 day2 = day1;
        System.out.println(day1.name + " " + day2.name);
        System.out.println(day1 == day2);
        System.out.println(day1.equals(day2));

        System.out.println("**************************************");

        //deep clonning

        Day1 day3 = new Day1("ashish");
        Day1 day4 = (Day1) day3.clone();
        System.out.println(day3.name + " " + day4.name);
        System.out.println(day3 == day4);
        System.out.println(day3.equals(day4));


    }

    public static String formTheLargestNumber(String[] arr) {
        Arrays.sort(arr, (num1, num2) -> (num2 + num1).compareTo(num1 + num2));
        StringBuilder str1 = new StringBuilder();
        for (String s : arr) {
            str1.append(s);
        }
        return str1.toString();
    }

    public static String formTheSmallestNumber(String[] arr) {
        Arrays.sort(arr, (num1, num2) -> (num1 + num2).compareTo(num2 + num1));
        StringBuilder str2 = new StringBuilder();
        for (String s : arr) {
            str2.append(s);
        }
        return str2.toString();
    }

    public static int findFirstRepetatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }

    public static int findFirstNonReapeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return i;
            }

        }
        return -1;
    }


}
