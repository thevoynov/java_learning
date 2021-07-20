package com.alishev.beginning.Lesson21;

public class Lesson21 {
    public static void main(String[] args) {
        Human human1 = new Human("Саша", 18);
        Human human2 = new Human("Тоня", 28);
        human2.setName("sdsd");
        human2.setAge(122);
        Human.description = "Nice";
        Human.getDescription();
    }
}

class Human {
    private String name;
    private int age;

    public static String description;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription() {
        System.out.println(description);
    }

}