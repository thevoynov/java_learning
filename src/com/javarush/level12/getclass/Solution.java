package com.javarush.level12.getclass;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o.getClass().getSimpleName().equals("Cat")) {
            return "Кошка";//напишите тут ваш код
        } else if (o.getClass().getSimpleName().equals("Tiger")) {
            return "Тигр";
        } else if (o.getClass().getSimpleName().equals("Lion")) {
            return "Лев";
        } else if (o.getClass().getSimpleName().equals("Bull")) {
            return "Бык";
        } else if (o.getClass().getSimpleName().equals("Pig")) {
            return "Свинья";
        } else {
            return "Животное";
        }
    }

        public static class Cat {

        }

        public static class Tiger {
        }

        public static class Lion {
        }

        public static class Bull {
        }

        public static class Pig {
        }
}
