package com.gerbertShildtBeginnigManual.part4.RetMeth;
class Vehicle {
    int passangers; //  количество пассажиров
    int fuelcap;    //  ёмкость топливного бака
    int mpg;        //  потребление топлива в милях на галлон

    //  Возврат дальности поездки
    int range() {
        return mpg * fuelcap;
    }
}

public class RetMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        //  Присваивание значений полям объекта minivan
        minivan.passangers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //  Присваивание значения полям объекта sportscar
        sportscar.passangers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        //  Получение дальности поездки для разных
        //  транспортных средств
        range1 = minivan.range();   //  Они не нужны
        range2 = sportscar.range(); //

        System.out.println("Мини-фургон может перевезти "
                + minivan.passangers + "\nна расстояние "
                + minivan.range() + " мили.");
        System.out.println("Мини-фургон может перевезти "
                + sportscar.passangers + "\nна расстояние "
                + sportscar.range() + " мили.");
    }
}
