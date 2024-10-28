package com.java.Sorting;

public class SelectionSort {

    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr={7, 8, 5, 9, 10, 11, 12, 47,};
        for(int i=0; i<arr.length-1; i++){
            int smallest=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            //swapping
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        printArray(arr);
    }
}
