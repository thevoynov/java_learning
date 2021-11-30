package com.javarush.level10.constructors;


public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstname;
        private String secondname;
        private int age;
        private int weight;
        private int height;
        private boolean sex;

        public Human() {

        }

        public Human(String firstname) {
            this.firstname = firstname;
        }

        public Human(String firstname, String secondname) {
            this.firstname = firstname;
            this.secondname = secondname;
        }

        public Human(String firstname, String secondname, int age) {
            this.firstname = firstname;
            this.secondname = secondname;
            this.age = age;
        }

        public Human(String firstname, String secondname, int age, int weight) {
            this.firstname = firstname;
            this.secondname = secondname;
            this.age = age;
            this.weight = weight;
        }


        public Human(String firstname, String secondname, int age,
                            int weight, int height) {
            this.firstname = firstname;
            this.secondname = secondname;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String firstname, String secondname, int age,
                            int weight, int height, boolean sex) {
            this.firstname = firstname;
            this.secondname = secondname;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(int age,
                            int weight, int height, boolean sex) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(int weight, int height, boolean sex) {
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(int height, boolean sex) {
            this.height = height;
            this.sex = sex;
        }


        // Напишите тут ваши переменные и конструкторы
    }
}