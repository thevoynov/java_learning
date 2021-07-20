package com.gerbertShildtFullManual.part9.Demo.p1;


class Derived extends Protection {
    Derived() {
        System.out.println("конструктор подкласса");
        System.out.println("n = " + n);

        //  доступно только для класса
        //  System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("конструктор из того же самого пакета");
        System.out.println("n = " + p.n);

        //  доступно только для класса
        //  System.out.println("n_pri = " + p.n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
public class Demo {
    public static void main(String args[]) {
        Protection ob1 = new Protection();
        com.gerbertShildtFullManual.part9.Demo.p1.Derived ob2 = new com.gerbertShildtFullManual.part9.Demo.p1.Derived();
        com.gerbertShildtFullManual.part9.Demo.p1.SamePackage ob3 = new com.gerbertShildtFullManual.part9.Demo.p1.SamePackage();
    }
}