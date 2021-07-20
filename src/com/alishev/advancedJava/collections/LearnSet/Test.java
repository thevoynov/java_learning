package com.alishev.advancedJava.collections.LearnSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        //  a < b < c ; 0 < 1 < 2
        //  aa < ab ; 00 < 01
        System.out.println();
        System.out.println("hashSet");
        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");

        for(String name : hashSet) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println("linkedHashSet");
        linkedHashSet.add("Mike");
        linkedHashSet.add("Katy");
        linkedHashSet.add("Tom");
        linkedHashSet.add("George");
        linkedHashSet.add("Donald");

        for(String name : linkedHashSet) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println("treeSet");
        treeSet.add("Mike");
        treeSet.add("Katy");
        treeSet.add("Tom");
        treeSet.add("George");
        treeSet.add("Donald");

        for(String name : treeSet) {
            System.out.println(name);
        }

        System.out.println();
        System.out.println("contains");
        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));

        System.out.println();
        System.out.println("isEmpty");
        System.out.println(hashSet.isEmpty());

        Set<Integer> set1 = new HashSet<>();
        for(int i = 0; i <= 5; i++) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int i = 2; i <= 7; i++) {
            set2.add(i);
        }

        //  union - объединение
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(union);

        //  interception -  пересечение множеств
        Set<Integer> interception = new HashSet<>(set1);
        interception.retainAll(set2);

        System.out.println(interception);

        //  difference -  разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println(difference);
    }
}
