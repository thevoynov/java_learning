package com.Alishev.Beginning.Lesson11;

import com.Alishev.Beginning.Lesson45.Person;

public class Arrays {
    public static void main(String[] args) {
        int number = 10;                //  приметивный тип данных
        int[] numbers = new int[5];    //  ссылочный тип данных
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println("Инкремент: Позиция массива " + i
                    + " равна " + numbers[i]);
        }

/*
        for (int i = 4; i < numbers.length; i--) {
            numbers[i] = i * 2;
            System.out.println("Декремент: Позиция массива " + i
                    + " равна " + numbers[i]);
        }*/
    }

}
