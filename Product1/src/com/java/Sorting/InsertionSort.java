package com.java.Sorting;

public class InsertionSort {

    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={7, 8, 1, 3, 2};

        //insertion sort
        for(int i=0;i<arr.length; i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

        printArray(arr);
        System.out.println("****************");
        insertionSort();
    }

    public static void insertionSort(){
        int[] arr={2, 5, 4, 6, 9, 7, 8, 2, 1, 3};
        for(int i=0; i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>0 && arr[j]>current){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
