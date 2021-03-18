package com.GerbertShildt.part3;

class ContDemo {
    public static void main(String args[]) {
        int i;
        //  Вывод четных чисел в пределах от 0  до 100
        for(i = 0; i <= 100; i++) {
            if ((i%2) != 0) continue;   //  Завершение шага итерация цикла
            System.out.println(i);
        }
    }
}
