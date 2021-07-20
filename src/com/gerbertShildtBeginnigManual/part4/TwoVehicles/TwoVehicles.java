package com.gerbertShildtBeginnigManual.part4.TwoVehicles;
class Vehicle {
    int passangers; //  количество пассажиров
    int fuelcap;    //  ёмкость топливного бака
    int mpg;        //  потребление топлива в милях на галлон
}
class TwoVehicles {

    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        //  Присвоение значений полям объекта minivan
        minivan.passangers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        //  Присвоение значений полям объекта sportscar
        sportscar.passangers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 21;
        //  Расчёт дальности поездки с полным баком горючего
        range1 = minivan.fuelcap *  minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Мини-фургон может перевезти "
                + minivan.passangers + " пассажиров\nна расстояние "
                + range1 + " мили.");
        System.out.println("Спортивный автомобиль может перевезти "
                + sportscar.passangers + " пассажиолв\nна расстояние "
                + range2 + " мили.");
    }

}