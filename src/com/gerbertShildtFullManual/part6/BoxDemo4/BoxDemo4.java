package com.gerbertShildtFullManual.part6.BoxDemo4;

class Box {
    double width;
    double height;
    double depth;

    //  рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo4 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        //  присвоить значения переменным экземпляра mybox1

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        /*  присвоить другие значения переменным экземпляра mybox2 */

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //  получить объём первого параллепипеда

        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        //  получить объём второго параллепипеда

        vol = mybox2.volume();
        System.out.println("Объём равен " + vol);
    }
}
