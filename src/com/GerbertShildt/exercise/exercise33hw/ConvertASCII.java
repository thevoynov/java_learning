package com.GerbertShildt.exercise.exercise33hw;

public class ConvertASCII {
    public static void main(String args[])
        throws java.io.IOException {
        char choice, ignore;
        char choice_ascii = '0';
        do {
            System.out.println("Введите букву");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (choice >= 'a' & choice <= 'z') {
                byte k = -32;
                choice_ascii = (char) (choice + k);
                System.out.print("Выбранная клавиша " + choice
                        + " Преобразованная клавиша " + choice_ascii);
                System.out.println();
            } else if (choice >= 'A' & choice <= 'Z') {
                byte k = +32;
                choice_ascii = (char) (choice + k);
                System.out.print("Выбранная клавиша " + choice
                        + " Преобразованная клавиша " + choice_ascii);
                System.out.println();
            } else {
                System.out.print("Выбранная клавиша не является буквой");
            }
        } while (choice != ' ');
    }
}