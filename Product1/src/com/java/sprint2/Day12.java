package com.java.sprint2;

import java.util.Arrays;

/*REVERSE THE ARRAY WITHOUT USING ANY INBUILT FUNCTION*/
public class Day12 {

   final static int [] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
   final static int order=8;

    public static void main(String[] args) {
        rotate(arr, order);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr, int order){
        if(arr ==null || arr.length==0 ||order <0){
            throw new IllegalArgumentException("illegal argument");
        }

        if(order >arr.length){
            order =order %arr.length;
        }
        //length of first part
        int a=arr.length-order;
        reverse(arr, 0, a-1);
        reverse(arr, a, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    public static void reverse(int[] arr, int left, int right){
        if(arr ==null || arr.length ==1){
            return;
        }
        while (left<right){
            int temp =arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
