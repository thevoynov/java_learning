package com.gerbertShildtFullManual.part6.BoxDemo6;
class Box {
    double width;
    double heigtht;
    double depth;

    //  это конструктор класса Box

    Box() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        heigtht = 10;
        depth = 10;
    }

    //  рассчитать и возвратить объём
    double volume() {
        return width * heigtht * depth;
    }
}
class BoxDemo6 {
    public static  void main(String args[]) {
        //  объявиь, выделить память и инициализировать
        //  объект типа Box

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        //  получить объём первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        //  получить объём второго параллепиперда
        vol = mybox2.volume();
        System.out.println("Объём равен " + vol);
    }

}
