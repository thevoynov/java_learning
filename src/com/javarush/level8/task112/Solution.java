package com.javarush.level8.task112;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static class Dog {
        Dog() {

        }
    }

    public static class Cat {
        Cat() {

        }
    }



    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);

    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        //напишите тут ваш код
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);

        pets.addAll(dogs);

        //напишите тут ваш код
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Set<Object> petsCopy = new HashSet<>(pets);
        for(Object o : petsCopy) {
            pets.removeAll(cats);//напишите тут ваш код
        }
    }

    public static void printPets(Set<Object> pets) {
        for(Object o : pets) {
            System.out.println(o);//напишите тут ваш код
        }
    }

    //напишите тут ваш код
}

