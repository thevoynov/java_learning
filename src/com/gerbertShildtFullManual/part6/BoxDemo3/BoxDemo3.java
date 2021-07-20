package com.gerbertShildtFullManual.part6.BoxDemo3;

class Box {
    double width, height, depth;
    void volume() {
        double num = width * height * depth;
        System.out.println("Объём равен " + num);
    }
}

class BoxDemo3 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        //  присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        /*  присвоить другие значения переменным
            экземпляра mybox2   */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //  вывести объём первого параллепипида
        mybox1.volume();

        //  вывести объём воторого параллепипеда
        mybox2.volume();
    }
}
