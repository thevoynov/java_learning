package com.javarush.level7.task123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;



        int[] intMass = getInts();
        for(int j : intMass) {
            if(maximum < j)
                maximum = j;
            if(minimum > j)
                minimum = j;
        }

        System.out.print(maximum + " " + minimum);
    }

    public static  int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] intMass = new int[20];
        for(int i = 0; i < intMass.length; i++) {
            intMass[i] = Integer.parseInt(reader.readLine());
        }
        return intMass;
    }//напишите тут ваш код
}