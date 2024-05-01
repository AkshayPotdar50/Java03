package com.java.sprint1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello","hello", "world", "stream", "hlatmap");

        List<String> distinct =words.stream().map(word-> word.split(" ")).flatMap(Arrays::stream).distinct().toList();
        System.out.println(distinct);
        ;

    }
}
