package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList <Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
         arrayList.add(random.nextInt(0,2));
         linkedList.add(random.nextInt(0,2));
        }
//        System.out.println(arrayList);
//        System.out.println(linkedList);

        sortArray(arrayList);
        sortLinked(linkedList);
    }
    static void sortArray (List list) {
        Collections.sort(list);
        System.out.println(list);
    }
    static void sortLinked (List list) {
        Collections.sort(list);
        System.out.println(list);
    }
}
