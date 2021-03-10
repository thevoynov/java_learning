package com.GerbertShildt.exercise11;
/*
    Упражнение 1.1

    Программа перевода галлонов в литры.

    Присвойте файлу с исходным кодом имя GalToLit.java
 */
class GalToLit {
    public static void main(String args[]) {
        double gallons; //  в этой переменной хранится значение,
                        //  выражающее уровень жидкости в галлонах
        double  liters; //  в этой переменой хранится значение,
                        //  выражающее объём жидкости в литрах
        gallons = 10;   //  начальноезначение соотвествует 10 галонам
        liters = gallons * 3.7854;  //  перевод в литры
        System.out.println(gallons + " галлонам соответсвует " + liters + " литра");
    }
}
