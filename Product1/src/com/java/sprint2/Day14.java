package com.java.sprint2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day14 {
    public static void main(String[] args) {
        String str="akshay";
        System.out.println(reverseString(str));
        System.out.println("********************************************");
        System.out.println(reverseString1(str));

    }

    //reverse a string without using inbuilt function
public static String reverseString(String input){
        char[] chars= input.toCharArray();
        int left=0, right=chars.length-1;
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);

}

public static String reverseString1(String input){
        char[] chars=input.toCharArray();
        int left=0; int right=chars.length-1;
        while(left <right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
}

public static void swapNumbers(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
    System.out.println("after swapping "+a+" "+b);
}


//Write a Java Program to count the number of words in a string using
//HashMap

    public Map<String, Integer> countWords(String input){

        Map<String, Integer> wordCount= new HashMap<>();
        String[] words=input.split("\\s+");
        for(String word :words){
            wordCount.put(word, wordCount.getOrDefault(word, 0)+1);

        }
        return wordCount;
    }

    //Write a Java Program to iterate HashMap using While and advance for
    //loop

    public void iterateHashMap(Map<String, Integer> map){
        //using advanced for loop
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" ->"+entry.getValue());
        }

        //using iterator
        Iterator<Map.Entry<String, Integer>> iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry=iterator.next();
            System.out.println(entry.getKey()+"->"+entry.getValue());

        }
    }

    //write a java code to find number is prime or not using most efficient way

    public boolean isPrime(int num){
        if(num <=1) return false;
        if(num <=3) return true;
        if(num %2==0 ||num %3 ==0) return false;
        for(int i=5; i*i <=num; i+=6){
            if(num %i ==0 || num %(i+2) ==0) return false;
        }
        return true;
    }

    //write a java code to find the string is palindrome
    public boolean isPalindrome(String input){
        for(int i=0; i<input.length()/2; i++){
            if(input.charAt(i) !=input.charAt(input.length()-i-1)){
                return false;
            }

        }
        return true;
    }

    //fibonacci series by normal and recurrsive way

    //recursive way
    public int fibonacci(int n){
        if(n<1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    //simple way
    public static void fibonacciSeries(){
        int N=10;
        int num1 =0;
        int num2=1;

        System.out.println("fibonacci series N="+N);
        System.out.println(num1+" "+num2);
        int i=2;
        while(i<N){
            i++;
            int temp=num1+num2;
            num1=num2;
            num2=temp;
            System.out.println(" "+num2);
        }
    }

    //Iterate over arraylist using for loop, while loop and advanced for loop
    public void iterateList(List<Integer> list){
        //using for loop
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        //using while loop
        int j=0;
        while(j<list.size()){
            System.out.println(list.get(j));
            j++;
        }

        //using enhanced for loop
        for(int item:list){
            System.out.println(item);
        }
    }

    //write a java program to find duplicate character in string


    //using java 8
    public static void findDuplicate(String str){
        Map<Character, Long> charFreq=str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(Map.Entry<Character, Long> entry:charFreq.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" :"+entry.getValue());

            }
        }
    }

    //write a java program to find second heighest number in array
    public static int findHeighest(int[] arr){
        int heighest= Arrays.stream(arr).distinct().boxed().sorted((a, b)->b-a).skip(1).findFirst().orElse(-1);
        return heighest;
    }


    //write a java program to find second Lowest number in array
    public static int findLowest(int[] arr){
        int Lowest= Arrays.stream(arr).distinct().boxed().sorted().skip(1).findFirst().orElse(-1);
        return Lowest;
    }

    



}
