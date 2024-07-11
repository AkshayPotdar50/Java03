package com.java.HackerRank;

import java.util.Arrays;

public class ArrayVariance {
    public static void main(String[] args) {
        int[] arr={10, 2, 5, 9, 3, 1, 6, 4, 8, 7};

        //calculate the mean
        double mean= Arrays.stream(arr).average().orElseThrow(IllegalArgumentException::new);

        //calculate the squared difference and the varaiance
        double varaiance=Arrays.stream(arr).mapToDouble(num->Math.pow(num-mean, 2)).average().orElseThrow(IllegalArgumentException::new);
        System.out.println("Mean of the array:"+mean);
        System.out.println("varaiance of the array: "+varaiance);
        System.out.println("******************************************");

        double deviation=Math.sqrt(varaiance);

        //output the result
        System.out.println("mean of the array:"+mean);
        System.out.println("deviation"+deviation);
    }


}
