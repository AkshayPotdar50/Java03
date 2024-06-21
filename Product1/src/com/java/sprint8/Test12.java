package com.java.sprint8;

import java.util.*;

public class Test12 {

    //iterator and listiterator

    /*List example using listiterator*/
    public static void main(String[] args) {
        List<String> arraylist= new ArrayList<>(Arrays.asList("a","b","c","d","e"));

        //forward iteration using listiteratir
        ListIterator<String> listIterator = arraylist.listIterator();

        while(listIterator.hasNext()){
            String element= listIterator.next();
            System.out.println("next element"+element);
        }

        while(listIterator.hasPrevious()){
            String element1= listIterator.previous();
            System.out.println("previous element"+element1);

        }

        //set example using iterator
        Set<Integer> hashset= new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        Iterator<Integer> setiterator= hashset.iterator();
        while (setiterator.hasNext()){
            Integer num1=setiterator.next();
            System.out.println("next element"+num1);
        }


        //while using map
        Map<String, Integer> hashmap= new HashMap<>();
        hashmap.put("one",1);
        hashmap.put("two",2);
        hashmap.put("three",3);

        Iterator<Map.Entry<String, Integer>> mapiterator=hashmap.entrySet().iterator();

        while (mapiterator.hasNext()){
            Map.Entry<String, Integer> entry=mapiterator.next();
            System.out.println("key"+entry.getKey()+" "+"value"+entry.getValue());
        }

    }
}
