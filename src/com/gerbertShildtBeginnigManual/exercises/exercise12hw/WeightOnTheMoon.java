package com.gerbertShildtBeginnigManual.exercises.exercise12hw;
/*
Расчёт веса на луне
 */
class WeightOnTheMoon {
        public static void main(String args[]) {
            double  g_earth = 9.18,
                    g_moon = g_earth * 0.17,
                    my_mas = 10,
                    weight_earth = my_mas * g_earth,
                    weight_moon = my_mas *  g_moon;

            System.out.println("Мой вес на земле " + weight_earth + "кг");
            System.out.println("Мой вес на луне " + weight_moon + "кг");
        }
}