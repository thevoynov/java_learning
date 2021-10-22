package com.javarush.level8.task114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = Integer.MAX_VALUE;
        for(Integer i : array)
            if(i < min)
                min = i;

        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int j = Integer.parseInt(reader.readLine());
        for(int i = 0; i < j; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        // Создать и заполнить список тут
        return list;
    }
}