package com.gerbertShildtBeginnigManual.part5;

public class CLDemo {
    public static void main(String args[]) {
        System.out.println("Программе передано " + args.length
                + " аргумент командной строки.");
        System.out.println("Список аргументов: ");
        for (int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}
