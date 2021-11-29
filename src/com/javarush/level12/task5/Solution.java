package com.javarush.level12.task5;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {

        String objectClassName = o.getClass().getSimpleName();

        switch (objectClassName) {
            case ("Dog"): return "Собака";
            case ("Cow"): return "Корова";
            case ("Pig"): return "Свинья";
            case ("Whale"): return "Кит";
            default: return "Такого класса нет";
        }

        //Напишите тут ваше решение


    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
