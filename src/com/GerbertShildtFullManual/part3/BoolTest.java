package com.GerbertShildtFullManual.part3;

class BoolTest {
    public static void main(String args[]) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        if(b) System.out.println("Этот код выполняется");
        b = false;
        if(b) System.out.println("Этот код не выполняется");

        //  результат сравнения - значение типа boolean
        System.out.println("10 > 9 равно " + (10 > 9));
        int i = 0b1000;
        System.out.println("i равно " + i);
        double c = 0x12.2P2;
        System.out.println("c равно " + c);
        System.out.println("Hello Wo rld");
        System.out.println("two\nlines ");
        System.out.println("\"This is in quotes\"");
    }
}
