package com.GerbertShildtFullManual.part7.AccessTest;

/*
В этой программе демонстрируется отличие модификаторов public и private.
 */

class Test {
    int a;  // доступ, определяемый по умолчанию
    public  int b;  //  открытй доступ
    private int c;  //  закрытый доступ
    //  методы доступа к члену с данного класса
    void setc(int i) {
        //  установить значение члена с данного класса
        c = i;
    }
    int getc() {
        //  получить значение члена с данного класса
        return c;
    }
}


class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        //  Эти операторы правильны, поэтому члены a и b
        //  данного класса доступны непосредственно

        ob.a = 10;
        ob.b = 20;

        //  Этот оператор неверен и может вызвать ошибку
        //  ob.c = 100; // ошибка
        //  (public int c; - в таком случае ошибки не будет)
        //  Доступ к члену с данного класса должен
        //  осущевствляться с помощью методов его класса

        ob.setc(100);   //  Верно!

        System.out.println("a, b, и с: " + ob.a + " "
                + ob.b + " " + ob.getc());
    }
}
