package com.javarush.level8.task122;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[1];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {

        int max = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            char[] alpha = new char[array.length];
            alpha = array[i].toCharArray();
            for(int j = 0; j < alpha.length; i++) {
                if(max < alpha[0]) {

                }
                if(max > alpha[0]) {

                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}