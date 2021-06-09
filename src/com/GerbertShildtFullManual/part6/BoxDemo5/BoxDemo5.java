package com.GerbertShildtFullManual.part6.BoxDemo5;

class Box {
    double width;
    double height;
    double depth;

    //  рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    };

    //  установить размеры параллепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo5 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //  инициализировать каждый экземпляр класса Box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3,6,9);

        //  получить объём первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        //  получить объём второго параллепиперда
        vol = mybox2.volume();
        System.out.println("Объём равен " + vol);
    }
}
