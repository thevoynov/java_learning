package com.GerbertShildt.part4.CompFuel;
/*
    Добавление параметризированного метода, в котором выполняется
    расчёт объёма топлива, необходимого транспортному средству
    для преодаления заданного расстояния.
 */
class Vehicle {
    int passengers, fuelcap, mpg;   //  количество пассажиров,
                                    //  емкость топливного бака,
                                    //  потребление топлива в милях на галлон
    //  опредение дальности поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }
    //  Расчёт количества топлива, необходимого транспортному
    //  средству для предоленя заданного расстояния
    double fuelneeded (int miles) {
        return (double) miles / mpg;
    }
}

class CompFuel {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

        //  Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //  Присваивание значений полям объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Для преодаления " + dist + " миль спортивному автомобилю требуется "
                + gallons + " галлонов топлива.");
        gallons = sportscar.fuelneeded(dist);
        System.out.println("Для преодаления " + dist + " миль спортивному автомобилю требуется "
                + gallons + " галлонов топлива.");

    }

}
