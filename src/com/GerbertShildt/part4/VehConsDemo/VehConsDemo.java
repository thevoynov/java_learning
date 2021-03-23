package com.GerbertShildt.part4.VehConsDemo;
//  Добавление конструктора

class Vehicle {
    int passngers;  //  количество пассажиров
    int fuelcap;    //  емкость топливного бака
    int mpg;        //  потребление топлива в милях на галлон

    // Это конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passngers = p;
        fuelcap = f;
        mpg = m;
    }

    //  Определение дальности поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    //  Расчёт объёма топлива, необходимого транспортному
    //  средству для преодоления заданного расстояния
    double fuelneeded (int miles) {
        return (double) miles / mpg;
    }
}


class VehConsDemo {
    public static void main(String args[]) {

        //  Завершение создания объектов транспортных средств
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist
                + " миль мини-фургону автомобилю требуется "
                + gallons + " галлонов топлива.");
        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist
                + " миль спортивному автомобилю требуется "
                + gallons + " галлонов топлива.");
    }
}
