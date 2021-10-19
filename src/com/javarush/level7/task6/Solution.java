package com.javarush.level7.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int index = 0;

        for(int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }

        for(int j = 0; j < 9; j++) {
            if(arrayList.get(j).length() > arrayList.get(j+1).length()) {
                System.out.println(arrayList.indexOf(arrayList.get(j+1)));
                break;
            }
        }
        //напишите тут ваш код
    }
}