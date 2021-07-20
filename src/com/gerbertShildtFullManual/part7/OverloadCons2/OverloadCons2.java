package com.gerbertShildtFullManual.part7.OverloadCons2;


//  В этой версии класса Box один объект допускается
//  инициализировать другим объектом
class Box {
    double width;
    double height;
    double depth;

    //  Обратите внимание на этот конструктор. В качестве
    //  параметра в нём используется объект типа Box

    Box(Box ob) {   // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    //  конструктор, используемый, когда
    //  указываются все ращзмеры

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //  конструктор, используемный, если ни один из
    //  рахмеров не указан

    Box() {
        width = -1;     //  использовать значения -1 для
        height = -1;    //  обозначаения  неинициалзированного
        depth = -1;     //  параллелепипеда
    }

    //  конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //  рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void  main(String args[]) {
        //  создать параллелепипеды, используя
        //  разные конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);
        //  создать копию объёкта mybox1
        //  получить объём первого параллелепипеда

        System.out.println("Объём mybox1 равен " + mybox1.volume());
        //  получить объём первого параллелепипеда
        System.out.println("Объём mybox1 равен " + mybox2.volume());
        //  получить объём первого параллелепипеда
        System.out.println("Объём mybox1 равен " + mycube.volume());
        //  получить объём клона
        System.out.println("Объём mybox1 равен " + myclone.volume());
    }


}
