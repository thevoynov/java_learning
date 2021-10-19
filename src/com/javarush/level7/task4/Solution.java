package com.javarush.level7.task4;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        int countDelete = 0;
        int countAdd = 0;

        ArrayList<String> stringsNew = new ArrayList<>();
        for (String s : strings) {
            countAdd = 0;
            countDelete = 0;
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == 'р') {
                    countDelete++;
                    countAdd--;
                }

                if (s.charAt(i) == 'л') {
                    countAdd++;
                    countDelete--;
                }
            }
            System.out.println("s = " + s);
            System.out.println("s countAdd = " + countAdd);
            System.out.println("s countDelete= " + countDelete);
            if (countDelete > 0 && countAdd < 1) {
//                strings.remove(s);
            } else if (countAdd > 0 && countDelete < 1) {
                stringsNew.add(s);
                stringsNew.add(s);
            } else if (countAdd >= 0 && countDelete >= 0) {
                stringsNew.add(s);
            }
        }
        for(String str : stringsNew)
            System.out.println("str = " + str);
        return stringsNew;//напишите тут ваш код
    }

}