package com.gerbertShildtBeginnigManual.exercises.exercise21;
/*
    Вычислите расстояние до места вспышки молнии, звук от которого
    доходит до наблюдателя через 7,2 секунды.
 */
class Sound {
    public static void main(String args[]) {
        double dist_f = 1100 * 7.2;
        System.out.println("Расстояние до места выспышки молнии " +
                "составляет " + dist_f + " футов");
        double dist_m = 330 * 7.2;
        System.out.println("Расстояние до места выспышки молнии " +
                "составляет " + dist_m + " метров");
        double dist_rock_m = 330 * (74.4/2);
        System.out.println("Расстояние от меня до места скалы составляет " +
                dist_rock_m + " метров");
    }
}
