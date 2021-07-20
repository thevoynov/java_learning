package com.alishev.practiceBeginning.Day2;

public class JavaTrainee {
    public static void main(String[] args) {
        String j = "JAVA";

        int i = 0;
        System.out.println("while part");
        while (i <= 9) {
            System.out.print(i + " " + j + " ");
            i++;
        }

        System.out.println();
        System.out.println("do while part");
        i = 0;
        do {
            System.out.print(i + " " + j + " ");
            i++;
        } while (i < 10);

        System.out.println();
        System.out.println("for part");
        for(i = 0; i < 10; i++) {
            System.out.print(i + " " + j + " ");
        }

        System.out.println();
        System.out.println("second part");
        for(i = 0; i <= 10; i++) {
            System.out.println(i + " " + j);
        }
    }
}
