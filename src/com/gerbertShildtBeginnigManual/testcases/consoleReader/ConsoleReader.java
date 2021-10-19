package com.gerbertShildtBeginnigManual.testcases.consoleReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String s = reader.readLine();
        return s;
    }

    public static int readInt() throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
//        String s = reader.readLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int i = Integer.parseInt(s);
        int i = Integer.parseInt(reader.readLine());
        return i;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int i = Integer.parseInt(s);
        double d = Double.parseDouble(reader.readLine());
        return d;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean b = Boolean.parseBoolean(reader.readLine());
        return b;//напишите тут ваш код
    }

    public static void main(String[] args) throws Exception {

    }
}