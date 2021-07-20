package com.alishev.beginning.Lesson18;

public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(-1);
        person1.setName("");
        person1.speak();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if(userName.isEmpty()) {
            System.out.println("Ты ввёл пустое имя");
        } else
        name = userName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if(userAge < 0) {
            System.out.println("Ошибка, ты отрицательый возраст");
        } else
        age = userAge;
    }

    public int getAge() {
        return age;
    }

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