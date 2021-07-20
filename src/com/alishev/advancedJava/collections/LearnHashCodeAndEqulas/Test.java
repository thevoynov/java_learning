package com.alishev.advancedJava.collections.LearnHashCodeAndEqulas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        map.put(1, "Один");
        map.put(1, "Другое значение");

        set.add(1);
        set.add(1);

        System.out.println(map);
        System.out.println(set);

        Map<Person, String> map1 = new HashMap<>();
        Set<Person> set1 = new HashSet<>();

        Person person1 = new Person(1,"Mike");
        Person person2 = new Person(1,"Mike");

        map1.put(person1, "123");
        map1.put(person2, "123");

        set1.add(person1);
        set1.add(person2);

        System.out.println(map1);
        System.out.println(set1);

        Map<Person, String> map2 = new HashMap<>();
        Set<String> set2 = new HashSet<>();

        set2.add("Hello");
        set2.add("Hello");

        Integer x = 1;
//        x.equals();
//        x.hashCode();

    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id
                + ", name=" + name + '\''
                +"}";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}