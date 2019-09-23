package com.levelp.Ten;

import java.util.*;

public class Ten {
    public static void main(String[] args) {
        String[] b = {"0", "Игра", "Калькулятор"};
        System.out.println("Какой метод вы хотите запустить?");
        System.out.println("1. " + b[1]);
        System.out.println("2. " + b[2]);
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите число соответсвующее этому методу: ");
        int input2 = in2.nextInt();
        if (input2 == 1) {
            System.out.println("Вы выбрали Game");
            game();
        } else {
            System.out.println("Вы выбрали Test");
            calculator();
        }
    }

    public static void game() {
        System.out.println("Инициализация Игры.");
        String[] a = {"0", "кошка", "собака", "утка"};
        System.out.println("Какое слово выделяется из списка?");
        System.out.println("1. " + a[1]);
        System.out.println("2. " + a[2]);
        System.out.println("3. " + a[3]);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число соответсвующее этому слову: ");
        int input = in.nextInt();
        if (input == 1 || input == 2) {
            System.out.println("Вы ошиблись, это не " + a[input]);
        }
        if (input == 3) {
            System.out.println("Вы правы, это " + a[input]);
        }
        if (input > 3) {
            System.out.println("Введено некорректное значение.");
            game();
        }
    }

    public static void calculator() {
        System.out.println("Инициализация Калькулятора.");
        double num1 = getInt();
        double num2 = getInt();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Результат операции: "+result);

    }
    public static double getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        double num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }

}
