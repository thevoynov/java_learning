package com.alishev.beginning.Lesson16andLesson17;

public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameandAge("Роман", 15);
//        person1.name = "Роман";
//        person1.age = 50;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
//        person2.speak();
        /*
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();

         */


    }
}

class Person {
    String name;
    int age;

    void setNameandAge(String username, int userage) {
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }
    void speak() {
        int i = 0;
        do {
            System.out.println("Меня зовут " + name
                    + ", мне " + age + " лет.");
            i++;
        } while (i <= 2);
    }
}