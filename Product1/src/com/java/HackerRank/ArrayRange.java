package com.java.HackerRank;

import java.util.Arrays;

public class ArrayRange {
    public static void main(String[] args) {
        int[] arr={10, 2, 5, 4, 87, 56, 32, 14, 78, 45, 21, 56};
        int min= Arrays.stream(arr).min().orElseThrow(IllegalArgumentException::new);
        int max=Arrays.stream(arr).max().orElseThrow(IllegalAccessError::new);

        int range=max-min;
        System.out.println("range" +range);
    }
}
