package com.GerbertShildtBeginnigManual.part3;

class ForVar {
    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;

        //  Вычисление факториала числе от 1 до 5
        for(int i = 1; i <= 5; i++) {
            sum += i;   //  sum = sum + i
            fact *= i;  // fact = fact * i
        }
        //  однако здесь переменная i недоступна

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}

