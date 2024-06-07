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

        //find average of list
        List<Integer> list1=Arrays.asList(1, 2, 3, 4, 5);
        double average1=list1.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(average1);

        int secondLargest = Arrays.stream(numbers).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1L).findFirst().orElse(-1);
        System.out.println(secondLargest);
        int secondSmallest=Arrays.stream(numbers).distinct().boxed().sorted().skip(1L).findFirst().orElse(-1);
        System.out.println("*********************************************");

        //we can do the same for string array

        //1.Sort strings alphabetically in ascending order:
        String[] array1={"akshay", "ashish", "akshata", "swapnil", "sarang"};
        String[] sorted1=Arrays.stream(array1).sorted().toArray(String[]::new);
        System.out.println(Arrays.toString(sorted1));

        System.out.println("********************************************");
        //2.Sort strings alphabetically in descending order:
        String[] sorted2=Arrays.stream(array1).sorted(Comparator.reverseOrder()).toArray(String[]::new);
        System.out.println(Arrays.toString(sorted2));

        System.out.println("*********************************************");
        //3.Sort strings by length in ascending order:
        String[] byLength=Arrays.stream(array1).sorted(Comparator.comparing(String::length)).toArray(String[]::new);
        System.out.println(Arrays.toString(byLength));
        System.out.println("*************************************************");

        //4.Sort strings by length in descending order:
        String[] byLenghtReverse=Arrays.stream(array1).sorted(Comparator.comparing(String::length).reversed()).toArray(String[]::new);
        System.out.println(Arrays.toString(byLenghtReverse));

        System.out.println("***********************************************");

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

    //version: v1
    public static int[] moveZerosToRI(int[] arr){
        int insertpos=0;
        for(int num:arr){
            if(num !=0){
                arr[insertpos++]=num;
            }
        }
        while (insertpos<arr.length){
            arr[insertpos++]=0;
        }
        return arr;
    }

    //version:2

    public static int[] moveZerosR(int[] nums){
        int insertpos=0;
        for(int num:nums){
            if(num != 0){
                nums[insertpos ++]=num;
            }
        }
        while (insertpos <nums.length){
            nums[insertpos++]=0;
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

    //version:2

    public static int[] moveZerosTolef(int[] nums){
        int inserpos=nums.length-1;
        for(int i=nums.length-1 ; i>=0; i--){
            if(nums[i] !=0){
                nums[inserpos--]=nums[i];
            }
        }
        while (inserpos >=0){
            nums[inserpos--]=0;
        }
        return nums;
    }


    public static int[] moveZerosToL(int[] nums){
        int insertPos= nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] !=0){
                nums[insertPos--]=nums[i];
            }
        }
        while(insertPos >=0){
            nums[insertPos--]=0;
        }
        return nums;
    }

    //finding average of map
    public static double calculateAverage(Map<?, Integer> map){
        if(map.isEmpty()){
            return 0.0;
        }

        double sum=map.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        return sum;
    }


}
