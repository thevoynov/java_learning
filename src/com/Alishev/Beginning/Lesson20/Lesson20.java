package com.Alishev.Beginning.Lesson20;

public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Саша", 18);


    }
}

class Human {
    private String name;
    private int age;

    public Human() {
        System.out.println("Привет из первого конструктора.");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


}