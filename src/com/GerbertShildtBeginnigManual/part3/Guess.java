package com.GerbertShildtBeginnigManual.part3;

public class Guess {
    public static void main(String args[])
        throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("Задумана буква из диапазона A-Z");
        System.out.println("Попытайтесь угадать: ");

        ch = (char) System.in.read();   //  Чтение символа с клавиатуры
        if(ch == answer) System.out.println("** Правильно! **");
        else System.out.println("** Вы не угадали! **");

    }
}
