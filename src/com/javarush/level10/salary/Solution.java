package com.javarush.level10.salary;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] chars = text.toCharArray();
        for (int i = 0; i<40; i++) {
            for (int k = i; k< chars.length; k++) {
                System.out.print(chars[k]);
            }
            System.out.println();
        }

        //напишите тут ваш код
    }




}