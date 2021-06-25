package com.GerbertShildtFullManual.part9.Demo.p2;

import com.GerbertShildtFullManual.part9.Demo.p1.Protection;


class Protection2 extends com.GerbertShildtFullManual.part9.Demo.p1.Protection {
    Protection2() {
        System.out.println("конструктор, унаследованный из другого пакета");
        //  доступно только для данного класса или пакета
        //  System.out.println("n = " + n);
        //  доступно только для данного класса
        //  System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class OtherPackage {
    OtherPackage() {
        com.GerbertShildtFullManual.part9.Demo.p1.Protection p
                = new com.GerbertShildtFullManual.part9.Demo.p1.Protection();
        System.out.println("Конструктор из другого пакета");
    }
}


public class Demo {
    public static void main(String args[]) {
        Protection2 ob1 = new Protection2();
       OtherPackage ob2 = new OtherPackage();
    }
}