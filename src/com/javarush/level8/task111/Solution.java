package com.javarush.level8.task111;

import java.util.HashSet;
import java.util.Set;

/*
Set из котов
*/

public class Solution {
    public static class Cat {
        Cat() {

        }
    }

    public static void main(String[] args) {
        int count = 0;
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);

        Set<Cat> catsCopy = new HashSet<>(cats);
        for(Cat cat : catsCopy) {

            count++;
            if(count == 1)
                cats.remove(cat);

        }
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>(); //напишите тут ваш код. step 2 - пункт 2
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat catCh : cats) {
            System.out.println(catCh);// step 4 - пункт 4
        }
    }

    // step 1 - пункт 1
}