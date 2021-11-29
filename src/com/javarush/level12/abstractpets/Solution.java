package com.javarush.level12.abstractpets;

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        String name = "муська";
        public String getName() {
            return name;
        }
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        String name = "муська";
        public String getName() {
            return name;
        }
        public Pet getChild() {
            return new Cat();
        }
    }

}
