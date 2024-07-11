package com.java.HackerRank;

import java.util.Arrays;

public class ArreyMedian {
    public static void main(String[] args) {
        int[] arr={10, 2, 5, 3, 9, 1, 6, 4, 8, 7};

        //sort the array
        int[] sorted= Arrays.stream(arr).sorted().toArray();

        //find the median
        double median;
        int length=sorted.length;

        if(length%2 ==0){

            median=(sorted[length/2-1]+sorted[length/2])/2.0;
        }else{
            //if length is odd
            median=sorted[length/2];
        }

        System.out.println("Median of the array"+median);
    }
}
