package com.gerbertShildtBeginnigManual.testcases.pacSolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {

    public static int even;
    public static int odd;
    private static int a;
    private static double b;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = reader.readLine();
        a = Integer.parseInt(s);
        do {
            if(a%2 == 0)
                even++;
            else
                odd++;
            a = a / 10;
        } while (a % 10 != 0);
        System.out.println("Even: " + even + " Odd: " + odd);
        //напишите тут ваш код
    }
}