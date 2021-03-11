package com.GerbertShildt.part2;
/*
    Определение длины гипотенузы исходя из длины катетов,
    по теореме Пифагора
 */
class Hypot {
    public static void main(String args[]){
        double x = 3,
               y = 4,
               z = Math.sqrt(x*x + y*y);
        System.out.println("Длинна гипотенузы: " + z);
    }
}