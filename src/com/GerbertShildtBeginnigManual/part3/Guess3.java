package com.GerbertShildtBeginnigManual.part3;

class Guess3 {
    public static void main(String args[])
        throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.println("Попытайтесь её угадать: ");
        ch = (char) System.in.read();   //  чтение символа с клавиатуры
        if(ch == answer)
            System.out.println("Правильно!");
        else {
            System.out.println("Извините, нужная буква находится ");
            if(ch < answer)
                System.out.println("Ближе к конце алфавита");
            else
                System.out.println("Ближе к началу алфавита");
        }

    }
}
