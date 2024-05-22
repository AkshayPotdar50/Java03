package com.java.sprint5;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number of terms in fibonacci series");
        int n= scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci series");
        for(int i=0; i<=n; i++){
            System.out.print(fibonacci(i)+" ");
        }

        Scanner scanner2=new Scanner(System.in);
        System.out.println("enter the number to find factorial");
        int n1=scanner2.nextInt();
        System.out.println(factorial(n1));




    }
    public static int fibonacci(int n){
     if(n<=1){
         return n;
     }else {
         return fibonacci(n-1)+ fibonacci(n-2);
     }
    }

    public static long factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n* factorial(n-1);
        }
    }
}
