package com.Alishev.advancedJava.collections.LearnQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {

        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new LinkedList<>();

        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);

        //  person3 person2 person4 person1
        System.out.println(people.remove());
        System.out.println(people.peek());
        System.out.println(people);
//        for (Person person : people)
//            System.out.println(person);


        Queue<Person> people1 =
                new ArrayBlockingQueue<Person>(3);

        System.out.println(people1.offer(person3));
        System.out.println(people1.offer(person2));
        System.out.println(people1.offer(person4));
        System.out.println(people1.offer(person1));
    }
}

class Person {
    private int id;


    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}