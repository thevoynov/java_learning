package com.Alishev.AdvancedJava.Collections.LearnLinkedListFirst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {
        /*
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        */

        for (int i = 0; i < 100000; i++) {
            list.add(0,1);
        }

        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("end - start = " + (end - start));
    }
}
