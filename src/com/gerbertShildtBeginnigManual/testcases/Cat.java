package com.gerbertShildtBeginnigManual.testcases;

public class Cat {
    private String name = null;
    private int age = 1;
    private int weight = 1;
    private String address = null;
    private String color = "red";

    public void initialize(String name) {
        this.name = name;
        int age = this.age;
        int weight = this.weight;
        String color = this.color;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        String color = this.color;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        int weight = this.weight;
        String color = this.color;
    }

    public void initialize(int weight, String color) {
        String name = this.name;
        int age = this.age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        int age = this.age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    //напишите тут ваш код
}

