package com.GerbertShildtFullManual.part3;
// import java.io.IOException;
public class Area {
    public static void main(String args[])
        throws java.io.IOException {
        double pi, r, a;
        System.out.println("Введите радиус окружности: ");
        r = System.in.read();
        pi = Math.PI;
        a = pi * Math.pow(r, 2);

        System.out.println("Площадь круга равно " + a);

        r = 10.8;
        pi = 3.1416;
        a = pi * r * r;

        System.out.println("Площадь круга 2 равно " + a);
    }
}

