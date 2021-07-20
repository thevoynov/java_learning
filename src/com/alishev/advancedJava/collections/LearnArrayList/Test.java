package com.alishev.advancedJava.collections.LearnArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String args[]) {
        /*
        int[] x = new int[3];
        for (int i = 0; i < 4; i++) {
            x[i] = 1;
         */

        List<Integer> arrayList   //  <Integer>
                = new ArrayList<>();   // - только ссылочные типы

        for(int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        /*
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(9));
        */
        /*
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        for (Integer x : arrayList)
            System.out.println(x);
        */
        /*
        arrayList.remove(5);
        System.out.println(arrayList);
         */
    }
}

