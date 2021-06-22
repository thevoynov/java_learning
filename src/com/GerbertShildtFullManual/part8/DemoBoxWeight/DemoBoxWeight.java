package com.GerbertShildtFullManual.part8.DemoBoxWeight;

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
    //  конструктор, применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //  конструктор, применяемый в отсутствие размеров
    Box() {
        width = -1;
        height = -1;
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

//  расширить класс Box, включив в него поле веса

class BoxWeight extends Box {
    double weight;  //  вес параллелепипеда
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    BoxWeight() {
        super();
        weight = -1;
    }
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3,4,0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объём mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объём mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
    }

}
