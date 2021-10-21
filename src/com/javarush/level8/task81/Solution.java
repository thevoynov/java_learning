package com.javarush.level8.task81;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static Set<String> createSet() {
        Set<String> set= new HashSet<>();
        set.add("Лaaa");
        set.add("Лs");
        set.add("Лaa");
        set.add("Лsы");
        set.add("Лaaф");

        set.add("Лaaфa");
        set.add("Лфs");
        set.add("Лфaa");
        set.add("Лsфы");
        set.add("Лфaaф");

        set.add("Лaыaa");
        set.add("Лыs");
        set.add("Лaыa");
        set.add("Лыsы");
        set.add("Лaыaф");

        set.add("Лвaaa");
        set.add("Лвs");
        set.add("Лвaa");
        set.add("Лsвы");
        set.add("Лaвaф");

        return set;    //напишите тут ваш код


    }

    public static void main(String[] args) {

    }
}
