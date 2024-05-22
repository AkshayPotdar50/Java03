package com.java.sprint5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number to find facorial");
        int n=scanner.nextInt();
        long s=factorial(n);
        System.out.println(s);

    }
    private static long factorial(int n){
        if(n==0 ||n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
