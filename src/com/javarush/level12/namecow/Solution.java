package com.javarush.level12.namecow;

public class Solution {
    public static void main(String[] args) {

    }
    public static abstract class Animal {

        public abstract String getName();

    }

    public static class Cow extends Animal {

        private String name = "Бурёнка";


        public String getName() {
            return name;
        }

    }
}