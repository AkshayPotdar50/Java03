package com.java.HackerRank;

public class Test55 {
    public static void main(String[] args) {
        String s = " Hello ";
        s += " World ";
        s.trim( );
        System.out.println(s);

        StringBuilder sb = new StringBuilder(" Hello ");
        sb.append(" World ");
        System.out.println(sb.toString().trim( ));

        


    }

    public static String reverse(String input) {

        if(input == null || input.isEmpty()){
            return input;
        }

        return new StringBuilder(input).reverse( ).toString( );

    }

    public String reverse1(String str) {
        // exit or termination condition
        if ((null == str) || (str.length( )  <= 1)) {
            return str;
        }

        // put the first character (i.e. charAt(0)) to the end. String indices are 0 based.
        // and recurse with 2nd character (i.e. substring(1)) onwards
        return reverse1(str.substring(1)) + str.charAt(0);
    }
    public static String reverse2(String s1){
        return new StringBuilder(s1).reverse().toString();
    }


}
