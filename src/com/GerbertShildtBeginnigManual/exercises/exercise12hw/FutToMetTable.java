package com.GerbertShildtBeginnigManual.exercises.exercise12hw;
/*
    Успражнение 1.2 домашняя работа
    Эта программа отображает таблицу перевода фунтов в метры
*/
class FutToMetTable {
    public static void main(String args[]) {
        int f, count;
        double m;
        count = 0;
        for (f = 1; f <= 100; f++) {
            m = f * 39.37;
            System.out.println(f + "ф = " + m + "м");

            count++;
            if (count == 12) {
                System.out.println("#######");
                count = 0;
            }
        }
    }
}
