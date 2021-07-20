package com.gerbertShildtBeginnigManual.part1;
/*
    Демонстрация применения цикла for.
    Присвойте файлу с исходным кодом имя ForDemo.java.
 */
class ForDemo {
    public static void main(String args[]) {
        int count;
        int count2;
        for (count = 0; count <= 5; count++)
            System.out.println("Значение счётчика: " + count);
        System.out.println("Готово!");
    }
}