package com.java.sprint6;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        int n=100;
        System.out.println("prime number upto "+n+":");
        generateAndPrintPrime(n);

    }

    public static void generateAndPrintPrime(int n){
        for(int num =2; num<=n; num++){
            if(isPrime(num)){
                System.out.println(num+" ");
            }
        }
    }
    public static boolean isPrime(int num){
        if(num <=1){
            return false;
        }

        for(int i=2; i<Math.sqrt(num); i++){
            if( num %i ==0){
                return false;
            }
        }
        return true;
    }
}
