package com.GerbertShildtBeginnigManual.exercises.exercise22hw;

class Prime {
    public static void main(String args[]) {
        int i, j;
        boolean isprime;

        for (i = 2; i < 100; i++) {
            isprime = true;
            //  Проверить, делиться ли число без остатка
            for (j = 2; j <= i/j; j++)
                //  Если число делиться без остатка, значит оно не простое
                if ((i%j) == 0)
                    isprime = false;
                if(isprime)
                     System.out.println(i + " - простое число.");

        }
    }
}