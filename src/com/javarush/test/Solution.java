package com.javarush.test;

import java.awt.*;

/*
Компиляция программы
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File dir  = new File(line);



        // напишите тут ваш код
    }
}
