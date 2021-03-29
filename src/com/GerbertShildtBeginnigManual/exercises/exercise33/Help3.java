package com.GerbertShildtBeginnigManual.exercises.exercise33;

import java.io.IOException;


/*
    Справочная система об if, switch, for, while, do-while
 */
class Help3 {
    public static void main(String args[]) throws IOException {

        char choice, ignore;
        for (;;) {
            do {
                System.out.println("Справка:" +
                        "\n1. if" +
                        "\n2. switch" +
                        "\n3. for" +
                        "\n4. while" +
                        "\n5. do-while" +
                        "\n6. break" +
                        "\n7. continue" +
                        "\nВыберите:");
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;
            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("Инструкция для if:" +
                            "\nif(условие)" +
                            "\n инструкция;" +
                            "\nelse" +
                            "\n инструкция;");
                    break;
                case '2':
                    System.out.println("Инструкция для switch:" +
                            "\nswitch(выражение) {" +
                            "\n case константа {" +
                            "\n 2последовательность инструкций;" +
                            "\n break;" +
                            "\n -//- ..." +
                            "\n }" +
                            "\n}");
                    break;
                case '3':
                    System.out.println("Инструкция для for:" +
                            "\nfor(инициализация; условие; итерация)" +
                            "\n инструкция;");
                    break;
                case '4':
                    System.out.println("Инструкция для while:" +
                            "\nwhile(условие) " +
                            "\n инструкция;");
                    break;
                case '5':
                    System.out.println("Инструкция для do-while:" +
                            "\ndo {" +
                            "\n инструкция;" +
                            "\n} while (условие);");
                    break;
                case '6':
                    System.out.println("Инструкция для break:" +
                            "\nbreak; или break метка; {");
                    break;
                case '7':
                    System.out.println("Инструкция для continue:" +
                            "\ncontinue; или continue метка; {");
                    break;
                default:
                    System.out.println("Запрос не найден.");

            }
        }
    }
}
