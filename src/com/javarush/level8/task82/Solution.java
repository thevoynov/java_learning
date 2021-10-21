package com.javarush.level8.task82;


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();// напишите тут ваш код
        for(int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        set.removeIf(s -> s.hashCode() > 10);
        return set;
    }

    public static void main(String[] args) {


    }
}
