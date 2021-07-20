package com.gerbertShildtFullManual.part3;
// import java.io.IOException;

public class Area {
    public static void main(String args[])
        throws java.io.IOException {
        double pi, r, a;

        r = 10.8;
        pi = Math.PI;
        a = pi * Math.pow(r, 2);

        System.out.println("Площадь круга 2 равно " + a);
    }
}

