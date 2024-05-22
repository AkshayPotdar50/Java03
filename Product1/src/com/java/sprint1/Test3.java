package com.java.sprint1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello","hello", "world", "stream", "hlatmap");

        List<String> distinct =words.stream().map(word-> word.split(" ")).flatMap(Arrays::stream).distinct().toList();
        System.out.println(distinct);
        System.out.println("************************************");

        //flattening list of lists
        List<List<Integer>> listOfLists=Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> flattenedList= listOfLists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(flattenedList);

        System.out.println("***************************");

        //flattening a sequence of sentense
        List<String> sentenses = Arrays.asList(
                "hello world",
                "stream api is powerful",
                "java programming"
        );
        List<String> words1 =sentenses.stream()
                .flatMap(sentense->Arrays.stream(sentense.split(" ")))
                .toList();

        System.out.println(words1);

        System.out.println("***********flattening a list of optionals*********");

        List<Optional<String>> optionals= Arrays.asList(
                Optional.of("Hello"),
                Optional.empty(),
                Optional.of("world")
        );

        List<String> presentValues = optionals.stream()
                .flatMap(Optional::stream)
                .toList();
        System.out.println(presentValues);

        System.out.println("*********************flattening a list of filename*****************");

        List<Path> paths = Arrays.asList(
                Paths.get("/user/local/file1.txt"),
                Paths.get("/user/home/file2.txt"),
                Paths.get("/user/bin/file3.txt")
        );

        List<String> filenames = paths.stream()
                .flatMap(path -> Arrays.stream(path.toString().split("/")))
                .filter(part -> part.contains("."))
                .collect(Collectors.toList());

        System.out.println(filenames);

        System.out.println("***********************************flattening list of arrays******************");

        List<int[]> listOfArrays = Arrays.asList(
                new int[]{1, 2, 3},
                new int[]{4, 5},
                new int[]{6, 7, 8, 9}
        );

        List<Integer> flattenedList1 = listOfArrays.stream()
                .flatMapToInt(Arrays::stream)
                .boxed()
                .toList();

        System.out.println(flattenedList1);

    }




}
