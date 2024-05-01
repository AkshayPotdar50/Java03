package com.java.sprint1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test4 {
    public Test4() {
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 10, 23, 54, 74, 12};
        double average = Arrays.stream(numbers).average().orElse(0.0);
        System.out.println(average);
        System.out.println("*********************************************");

        int secondLargest = Arrays.stream(numbers).distinct().boxed().sorted((a, b) -> b - a).skip(1L).findFirst().orElse(-1);
        System.out.println(secondLargest);
        System.out.println("*********************************************");

        int secondMinimum = Arrays.stream(numbers).distinct().boxed().sorted().skip(1L).findFirst().orElse(-1);
        System.out.println(secondMinimum);
        System.out.println("***********************************");

        Set<Integer> set2 = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        int[] arrsy2 = new int[]{10, 23, 21, 12, 14, 47};
        IntStream var10000 = Arrays.stream(arrsy2);
        Objects.requireNonNull(set2);
        Set<Integer> intersection = var10000.filter(set2::contains).boxed().collect(Collectors.toSet());
        System.out.println(intersection);
        System.out.println("*****************************************");

        Set<Integer> union = new HashSet<>();
        union.addAll(Arrays.stream(arrsy2).boxed().collect(Collectors.toSet()));
        union.addAll(Arrays.stream(numbers).boxed().collect(Collectors.toSet()));
        System.out.println(union);
        System.out.println("********************************");

        int[] var11 = new int[]{0, 25, 5, 0, 36, 0, 7, 0, 8};
        System.out.println(Arrays.toString(moveZerosToLeft(var11)));
        System.out.println(Arrays.toString(moveZerosToRight(var11)));
    }


    //moving zeros to rigt in array
    public static int[] moveZerosToRight(int[] nums){
        int insertPos=0;
        for(int num:nums){
            if(num !=0){
                nums[insertPos++]=num;
            }
        }
        while (insertPos<nums.length){
            nums[insertPos++]=0;
        }
        return nums;
    }

    //moving zeros rigt in list
    public static List<Integer> moveZerosRight(List<Integer>list){
        return list.stream()
                .sorted((a, b)->a==0 ?(b==0?0:1) :(b==0?-1:0))
                .collect(Collectors.toList());
    }

    //moving zeros left in array
    public static int[] moveZerosToLeft(int[] nums){
        int insertPos=nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] !=0){
                nums[insertPos--]=nums[i];
            }
        }
        while (insertPos>=0){
            nums[insertPos--]=0;
        }
        return nums;
    }


}
