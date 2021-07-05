package com.Alishev.Beginning.Lesson26;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void SayHello() {
        System.out.println("Hello");
    }

    public void showInfo () {
        System.out.println("name is " + this.name);
    }
}
