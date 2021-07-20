package com.gerbertShildtFullManual.part7.Overload2;

class OverloadDemo {

    void test() {
        System.out.println("Параметр отсутсвует");
    }

    //  перегружаемый метод, проверяющий наличие
    //  двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    //  перегружаемый метод, проверяющий наличие
    //  параметра типа double
    void test(double a) {
        System.out.println("double a: " + a);
    }
}
class Overload2 {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        //  вызвать все варианты метода test();

        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);
    }
}
