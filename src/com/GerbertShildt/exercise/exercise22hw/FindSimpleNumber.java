package com.GerbertShildt.exercise.exercise22hw;

class FindSimpleNumber {
    public static void main(String args[]) {
        byte n = 2;
        byte x = 0;
        byte results = 0;
        byte nr = 0;
        byte nr_2 = 0;
        boolean b = false;

        for(n = 2; n < 100; n++) {
            for(x = 2; x < n; x++) {
                System.out.println("n = " + n);
                System.out.println("x = " + x);
                results = (byte) (n % x);
                System.out.println("results " + results);
                if (results == 0) {
                    b = true;
                    nr = n;
                }
                else {
                    b = false;

                }
                System.out.println("b : " + b);
                if(results > 0 & !b & nr != n) {
                    System.out.println("Найдено простое число: " + n);
                }
            }
        }
    }
}