package com.alishev.advancedJava.collections.LearnComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("frog");
        animals.add("fsdssg");
        animals.add("g");
        animals.add("sdsdzsdsd");

        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        System.out.println(numbers);

        List<Person> people = new ArrayList<>();
        people.add(new Person(111,"Bot"));
        people.add(new Person(4,"Bob"));
        people.add(new Person(3,"Boss"));
        people.add(new Person(5,"Bor"));
        people.add(new Person(2,"Bod"));
        people.add(new Person(11,"Bou"));
        people.add(new Person(42,"Bosi"));
        people.add(new Person(53,"Botisto"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });
        System.out.println(people);
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name'" + name
                + '\'' + "}";
    }
}