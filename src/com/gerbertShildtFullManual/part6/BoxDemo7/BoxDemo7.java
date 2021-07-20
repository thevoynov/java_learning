package com.gerbertShildtFullManual.part6.BoxDemo7;
/*
    В данном примере программы для инициализации
    размеров параллелепипела в классе Box применяется
    параметризированный конструктов
 */
class Box {
    double width;
    double height;
    double depth;

    //  Это констркуктор класса Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    //  Рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String args[]) {
        //  объявить, выделить память и инициализировать
        //  объекты типа Box

        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        //  получить объём первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объём первого равен " + vol);
        //  получить объём второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объём второго равен " + vol);
    }
}