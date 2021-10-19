package com.javarush.level7.task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++) {
            String string = reader.readLine(); //читаем строку с клавиатуры
            list.add(string);
        }


        ArrayList<String> result = doubleValues(list);
        for(String s : result) {
            System.out.println(s);
            // Вывести на экран result
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> listNew = new ArrayList<>();
        for(String s : list) {
            listNew.add(s);
            listNew.add(s);//напишите тут ваш код
        }
        return listNew;
    }
}