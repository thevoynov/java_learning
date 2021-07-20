package com.gerbertShildtBeginnigManual.part5;

public class ForEach {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        //  использование цикла типа for-each
        //  суммирование отображение значений

        for(int x: nums) {
            System.out.println("Значение: " + x);
            sum += x;
            if(x == 5) break;
        }
        System.out.println("Сумма этих значений: " + sum);
    }
}
