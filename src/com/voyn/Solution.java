package com.voyn;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


/*
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            if(60 % Float.parseFloat(reader.readLine()) == 2.5)
                System.out.println("зелёный");
            else if(Float.parseFloat(reader.readLine()) == 3)
                System.out.println("жёлтый");
            else if(Float.parseFloat(reader.readLine()) == 4)
                System.out.println("красный");
            else if(Float.parseFloat(reader.readLine()) == 5)
                System.out.println("зелёный");

    }
}