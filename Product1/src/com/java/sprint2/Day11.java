package com.java.sprint2;

import java.util.Arrays;

//below code is used to rotate array k times


public class Day11 {
    public static void main(String[] args) {
        int [] array1={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k=4;
        rotate(array1, k);
        System.out.println(Arrays.toString(array1));
    }
    public static void rotate(int[] nums, int k) {
        if(k > nums.length)
            k=k%nums.length;
        int[] result = new int[nums.length];
        for(int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }
        int j=0;
        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }
        System.arraycopy( result, 0, nums, 0, nums.length );
    }
}
