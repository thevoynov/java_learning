package com.gerbertShildtBeginnigManual.part2;

class CastDemo {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;
        x = 10.0;
        y = 3.0;

        i = (int) (x/y);    //  Привести типо double к типу int
        System.out.println("Целочисленный результат деления x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        b = 88; //  Явное приведение несовместимых типов
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}
