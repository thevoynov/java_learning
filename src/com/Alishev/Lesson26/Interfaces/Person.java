package com.Alishev.Lesson26.Interfaces;

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
