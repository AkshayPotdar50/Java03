package com.java.sprint7;

import java.util.Comparator;
import java.util.stream.IntStream;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String input = "abacdfgdcaba";
        String longestPalindrome = findLongestPalindrome(input);
        System.out.println("Longest palindrome substring: " + longestPalindrome);
    }

    public static String findLongestPalindrome(String str) {
        if (str == null || str.length() == 0) return "";

        return IntStream.range(0, str.length())
                .mapToObj(i -> {
                    String oddPalindrome = expandAroundCenter(str, i, i);
                    String evenPalindrome = expandAroundCenter(str, i, i + 1);
                    return oddPalindrome.length() > evenPalindrome.length() ? oddPalindrome : evenPalindrome;
                })
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    private static String expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
}
