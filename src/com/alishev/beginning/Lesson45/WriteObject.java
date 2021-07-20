package com.alishev.beginning.Lesson45;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");
        Person person3 = new Person(3, "Tom");
        Person[] people = {person1, person2, person3};
/*
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);

            for(Person person : people) {
                oos.writeObject(person);
            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
