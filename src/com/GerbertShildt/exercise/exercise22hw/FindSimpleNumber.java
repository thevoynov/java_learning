package com.GerbertShildt.exercise.exercise22hw;

class FindSimpleNumber {
    public static void main(String args[]) {
        byte b = 2;
        for (b = 2; b == 100; b++) {
            b = 2;
            b++;
            b %= (byte) b;
            System.out.println("Найденные простые числа в диапазоне от 2 до 100: " + b);
        }
    }
}
