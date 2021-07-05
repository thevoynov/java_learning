package com.Alishev.Beginning.Lesson15;

public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        person2.speak();

    }
}

class Person {
    String name;
    int age;

    void speak() {
        int i = 0;
        do {
            System.out.println("Меня зовут " + name
                    + ", мне " + age + " лет.");
            i++;
        } while (i <= 2);
    }
}