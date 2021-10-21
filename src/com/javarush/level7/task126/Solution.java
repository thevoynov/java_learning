package com.javarush.level7.task126;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human human1 = new Human("Tom", true, 32);
        Human human2 = new Human("Bob", true, 1);
        Human human3 = new Human("Sam", true, 3);
        Human human4 = new Human("Fred", true, 23);
        Human human5 = new Human("Rec", true, 29, human1, human2);
        Human human6 = new Human("Tyr", true, 12, human1, human2);
        Human human7 = new Human("Gik", true, 52, human1, human2);
        Human human8 = new Human("Tem", true, 222, human1, human2);
        Human human9 = new Human("Tam", true, 31, human1, human2);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());


        // напишите тут ваш код
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human mother;
        private Human father;// напишите тут ваш код

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }


        public Human(String name, boolean sex, int age, Human mother, Human father) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
