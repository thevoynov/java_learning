package com.JavaCourse.FirstLesson;

public class FirstLesson {
    public static void main(String[] args) {

        //byte(1), shot(2), int(4), long(8) - количаство байт у различных типов данных
        //int from -2147483648 to 2147483647

        System.out.println("Hello World II !");
        byte a = 127;
        printBinary(a,8);
        a = -128;
        printBinary(a,8);
    }

    private static void printBinary(byte value, int size) {
        for (int i = size - 1; i >= 0; i--) {
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }
}
