package com.GerbertShildt.part2;

public class TypeOfData {
    public static void main(String[] args) {

        //byte(1 байт), shot(2 байта), int(4 байта), long(8 байт) - количаство байт у различных типов данных
        //int from -2147483648 to 2147483647
        //Значения можно записывать в таком виде -2_147_483_648 to 2_147_483_647

        System.out.println("Hello World II !");

        byte b = Byte.MAX_VALUE;
        System.out.println("byte = " + b + " bit.");
        b = Byte.MIN_VALUE;
        System.out.println("byte = " + b + " bit.");

        short c = Short.MAX_VALUE;
        System.out.println("short = " + c + " bit.");
        c = Short.MIN_VALUE;
        System.out.println("short = " + c + " bit.");

        int a = Integer.MAX_VALUE;
        System.out.println("int = " + a + " bit.");
        a = Integer.MIN_VALUE;
        System.out.println("int = " + a + " bit.");

        long d = Long.MAX_VALUE;
        System.out.println("long = " + d + " bit.");
        d = Long.MIN_VALUE;
        System.out.println("long = " + d + " bit.");

    }

}
