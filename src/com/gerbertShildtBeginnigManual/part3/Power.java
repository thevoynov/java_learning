package com.gerbertShildtBeginnigManual.part3;
// Вычисление целых степенй числа 2
class Power {
    public static void main(String args[]) {
        int e;
        int results;
        for (int i = 0; i < 10; i++) {
            results = 1;
            e = i;
            while (e > 0) {
                results *= 2;
                e--;
            }
            System.out.println("2 в степени " + i + " равно " + results);
        }
    }
}
