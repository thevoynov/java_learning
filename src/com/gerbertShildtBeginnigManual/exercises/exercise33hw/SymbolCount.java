package com.gerbertShildtBeginnigManual.exercises.exercise33hw;

public class SymbolCount {
    public static void main(String args[])
        throws java.io.IOException {
        char choice = '0';
        char ignore = '0';
        char choice_sp = '0';
        boolean b = true;
        int t = 0;
        int t_sp = 0;
        do {
            System.out.println("Угадайте задуманный символ " +
                                "и введите его с клавиатуры:");
            choice = (char) System.in.read();
            if(choice == ' ') {
                t_sp++;
            }
            if(choice == '.') {
                b = false;
                System.out.println("ДААА! Вы угадали.");
                System.out.println("Количество раз, сколько " +
                                    "был нажат пробел " + t_sp);
            }
            else {
                t++;
                System.out.println(t + "-ая попытка");
                System.out.println("Нет! Попробуйте ещё.");
            }
            do {
                ignore = (char) System.in.read();
            }   while (ignore != '\n');
        } while (b);
    }
}