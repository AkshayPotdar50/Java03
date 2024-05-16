package com.java.sprint2;

import java.util.*;
import java.util.stream.Collectors;


//problems on streams
public class Day13 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        //finding even numbers
        List<Integer> even =list1.stream().filter(num->num%2==0).toList();
        System.out.println(even);

        //fonding odd numbers
        List<Integer> odd=list1.stream().filter(num->num %2 !=0).toList();
        System.out.println(odd);

        //find maximum value
        Optional<Integer> max=list1.stream().max(Integer::compare);

        Optional<Integer> max2=list1.stream().max(Comparator.reverseOrder());
        //above will return min

        //finding minimum
        Optional<Integer> min=list1.stream().min(Integer::compare);

        Optional<Integer> min2=list1.stream().min(Comparator.reverseOrder());
        //above will return maximum



        //find sum of elements
        int sum=list1.stream().mapToInt(Integer::intValue).sum();
       boolean check= list1.stream().mapToInt(Integer::intValue).anyMatch(num->num>6);
        System.out.println(check);
        int sum3=list1.stream().mapToInt(Integer::intValue).reduce(1, Integer::sum);
        System.out.println(sum3);

        //convert to uppercase
        List<String> list2 =Arrays.asList("alice gandhi", "bob chawla", "charlie dube");
        List<String> upper=list2.stream().map(String::toUpperCase).toList();

        //sorting operations
        List<Integer>sorted=list1.stream().sorted((a,b)->Integer.compare(b,a)).toList();
        List<Integer> sorted2=list1.stream().sorted(Integer::compare).toList();

        //count the element
        long count = list1.stream().filter(n->n<5).count();
        long countEven=list1.stream().filter(n-> n%2==0).count();
        long counOdd=list1.stream().filter(n->n%2 !=0).count();

        //get ditinct element
        List<Integer> distinct=list1.stream().distinct().toList();


        //reduce to sum
        long total =list1.stream().reduce(0, Integer::sum);

        //find any element
        Optional<Integer> anyElement =list1.stream().findAny();

        //list first names
        List<String> firstNames =list2.stream().map(name->name.split(" ")[0]).toList();

        //allMatch returns
        boolean allPositive=list1.stream().allMatch(n->n>0);


        //noneMatch
        boolean nonNegative =list1.stream().noneMatch(n->n<0);


        //findFirst
        Optional<Integer> FIRST=list1.stream().findFirst();

        //flatmap and nested list

        List<List<Integer>> nestedNumber=Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));
        List<Integer> flaTlist =nestedNumber.stream().flatMap(List::stream).toList();


        //peek elements

        List<Integer> peakAtNumbers =list1.stream().peek(System.out::println).toList();


        //limit stream

        List<Integer> limited= list1.stream().limit(3).toList();

        //skip elements
        
        List<Integer> skipped =list1.stream().skip(2).toList();

        //convert to set for finding unique elements

        Set<Integer> unique =list1.stream().collect(Collectors.toSet());

        //summerising statastics

        IntSummaryStatistics summaryStatistics=list1.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(summaryStatistics);








    }
    

}
class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        users.add(new User("akshay", 27));
        users.add(new User("prakash", 33));
        users.add(new User("bhavesh", 42));
        users.add(new User("kalpesh", 21));


        //grouping elements

        Map<Integer, List<User>> UserGroupByAge =users.stream()
                .collect(Collectors.groupingBy(User::getAge));

    }

}
