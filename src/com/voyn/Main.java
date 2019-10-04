package com.voyn;

public class Main {
    public static void main(String[] args){
        final float pi = 3.14f;
        Person.summ = Person.summ - 1;
        Person maks = new Person(180, 78.4f);
        Person.write("Your namber is " + Person.summ);
        maks.say("Hi, I'm Maks!");
        System.out.println(maks.height);

        Person oleg = new Person();
        oleg.height = 195;
        oleg.weight = 96.7f;
        oleg.summ = 428;
        System.out.println(oleg.height + " " + oleg.summ);

        Student vova = new Student(178, 98f, 3);
        System.out.println("vova курс " + vova.course + ". Рост " + vova.height + ". Вес " + vova.weight);
        System.out.println(Person.summ);
    }

}
