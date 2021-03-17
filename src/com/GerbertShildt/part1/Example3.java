package com.GerbertShildt.part1;
/*
    Демонстрация различий между типами int и double.

    Присвойте файлу с исходным кодом имя Example3.java
 */
public class Example3 {
    public static void main(String args[]){

        int var;    //  объявление целочисленной перемнной
        double x;   //  объявление переменной с плавающий точкой
        float y;    //  объявление переменной с плавающщей точкой
        var = 10;   //  присваивание переменной var значения 10
        x = 10.0;   //присваивание переменной x значения 10.0
        y = 10.0f;

        System.out.println("Начальное значение перемной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println("Начальное значение переменной y: " + y);
        System.out.println();   //  печать пустой строки

        //  Деление значения обеих переменных на 4

        var = var / 6;
        x = x / 6;
        y = y / 6;

        System.out.println("Значение переменной var после деления: " + var);
        System.out.println("Значение переменной x после деления: " + x);
        System.out.println("Значение переменной y после деления: " + y);

    }
}
