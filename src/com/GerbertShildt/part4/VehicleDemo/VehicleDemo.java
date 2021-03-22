package com.GerbertShildt.part4.VehicleDemo;

class Vehicle {
    int passangers; //  количество пассажиров
    int fuelcap;    //  ёмкость топливного бака
    int mpg;        //  потребление топлива в милях на галлон
}
class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        int range;
        //  Присваивание значений полям в объекте minivan
        minivan.passangers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        //  Расчёт дальности поездки с полным баком горючего
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Мини-фургон может перевезти "
                + minivan.passangers + " пассажиров\nна расстояние "
                + range + " миль");
    }
}