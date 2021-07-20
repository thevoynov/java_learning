package com.gerbertShildtFullManual.part7.OverloadCons;

class Box {
    double width;
    double height;
    double depth;

    //  конструктор, используемный когда
    //  указываются все размеры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //  конструктор, используемый, когда
    //  ни один из размеров не указан

    Box() {
        width = -1;     //  использовать значение -1, для
        height = -1;    //  обозначения неинициализированного
        depth = -1;     //  параллелепипеда
    }

    //  консруктор, используемный при создание куба
    Box(double len) {
        width = height = depth = len;
    }

    //  рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String args[]) {
        //  создать параллепипеды, используя разные
        //  конструкторы

        Box mybox1 = new Box(10,20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        //  получить объём первого параллелепипеда
        System.out.println("Объём mybox1 равен " + mybox1.volume());
        //  получить объём первого параллелепипеда
        System.out.println("Объём mybox1 равен " + mybox2.volume());
        //  получить объём первого параллелепипеда
        System.out.println("Объём mybox1 равен " + mycube.volume());
    }

}
