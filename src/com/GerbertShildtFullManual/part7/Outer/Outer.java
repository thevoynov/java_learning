package com.GerbertShildtFullManual.part7.Outer;

class Outer {
    int outer_x = 100;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    //  внтуренний класс

    class Inner {
        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
}
class InnerClassDemo{
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
