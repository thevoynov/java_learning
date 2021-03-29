package com.GerbertShildtBeginnigManual.part1;

/*
Демонострация использования пременных.
Присвоейте файлу с исходным кодом имя Example2.java.
 */

public class Example2 {
    public static void main(String args[]){
        int var1;   //объявлена переменная
        int var2;   //объявлена ещё одна переменная
    //  int var1, var2; можно было бы сделать и так.
        var1 = 1024; //переменной var1 присваивается значение 1024
        System.out.println("Переменная var1 содержит " + var1);
        var2 = var1/2;
        System.out.print("Переменная var2 содержит var1 / 2: ");
        System.out.println(var2);
    }
}
