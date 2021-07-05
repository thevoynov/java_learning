package com.Alishev.Beginning.Lesson10;

import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();

        switch (age) {
            case 0 :
                System.out.println("Ты родился.");
                break;
            case 7:
                System.out.println("Ты пошёл в школу");
                break;
            default:
                System.out.println("Не одно из условий не выполнилось.");
        }
    }
}
