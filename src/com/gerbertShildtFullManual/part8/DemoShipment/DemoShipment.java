package com.gerbertShildtFullManual.part8.DemoShipment;
//  Расширене класса BoxWeight включением в него
//  поля стоимости доставки

//  создавать сначала класс Box

class Box {
    private double width;
    private double height;
    private double depth;


    //  сконструировать клон объекта
    Box(Box ob) {   //  передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //  конструктор применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        width = -1;
        depth = -1;
    }

    //  конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //  рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

//  добавить поле веса
class BoxWeight extends Box {
    double weight;  //  вес параллепипеда

    //  сконструировать клон объекта
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }


    //  конструктор, применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); //  вызвать конструктор суперкласса
        weight = m;
    }

    //  конструктор, применяемый по умолчанию
    BoxWeight() {
        super();
        weight = -1;
    }

    //  конструктор, применяемый при создании куба
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

//  добавить поле стоимости доставки
class Shipment extends  BoxWeight {
    double cost;

    //  сконструировать клон объекта
    Shipment(Shipment ob) { //  передать объект конструктору
        super(ob);
        cost = ob.cost;
    }
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);  //  вызвать конструктор суперкласса
        cost = c;
    }

    //  конструктор, применяемый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    //  констуктор, применяемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.4);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("Объём shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки: $ " + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Объём shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки: $ " + shipment2.cost);
    }
}

