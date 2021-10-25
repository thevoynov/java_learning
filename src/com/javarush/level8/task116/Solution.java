package com.javarush.level8.task116;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

        Human sonFirst = new Human("Rob", true, 5);
        Human sonSecond = new Human("Sam", true, 1);
        Human sonThird = new Human("Gram", true, 2);

        ArrayList<Human> children = new ArrayList<Human>();

        children.add(sonFirst);
        children.add(sonSecond);
        children.add(sonThird);


        Human father = new Human("Bob", true, 42, children);
        Human mother = new Human("Jenny", false, 40, children);

        ArrayList<Human> childrenOldFirst = new ArrayList<Human>();
        ArrayList<Human> childrenOldSecond = new ArrayList<Human>();
        childrenOldFirst.add(father);
        childrenOldSecond.add(mother);
        Human grandFatherFirst = new Human("Sam", true, 72, childrenOldFirst);
        Human grandMotherFirst = new Human("Marry", false, 71, childrenOldFirst);

        Human grandFatherSecond = new Human("Mark", true, 82, childrenOldSecond);
        Human grandMotherSecond = new Human("Elly", false, 78, childrenOldSecond);

        System.out.println(sonFirst.toString());
        System.out.println(sonSecond.toString());
        System.out.println(sonThird.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(grandFatherFirst.toString());
        System.out.println(grandMotherFirst.toString());
        System.out.println(grandFatherSecond.toString());
        System.out.println(grandMotherSecond.toString());


        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;

            this.sex = sex;
            this.age = age;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

