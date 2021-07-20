package com.gerbertShildtBeginnigManual.exercises.exercise31;

import java.io.IOException;

/*
    Справочная система об if и switch
 */
class Help {
    public static void main(String args[]) throws IOException {
        System.out.println("Справка:\n1. if\n2. Switch\nВыберите: ");
        char choice = (char) System.in.read();
        switch (choice) {
            case '1':
                System.out.println("Инструкция для if:" +
                        "\nif(условие)" +
                        "\n инструкция" +
                        "\nelse" +
                        "\n инструкция");
                break;
            case '2':
                System.out.println("Инструкция для switch:" +
                        "\nswitch(выражение) {" +
                        "\n case константа {" +
                        "\n 2последовательность инструкций" +
                        "\n break;" +
                        "\n -//- ..." +
                        "\n }" +
                        "\n}");
                break;
            default:
                System.out.println("Запрос не найден.");

        }
    }
}
