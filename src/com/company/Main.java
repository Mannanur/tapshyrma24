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

        sort(arrayList);
        sort(linkedList);
    }
    static void sort (ArrayList list) {
        Collections.sort(list);
        System.out.println(list);
    }
    static void sort (LinkedList list) {
        Collections.sort(list);
        System.out.println(list);
    }
}
