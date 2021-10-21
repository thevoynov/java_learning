package com.javarush.level8.task66;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> arrayList = new ArrayList<>();
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int count = 1;
        int count2 = 1;

        for(int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));//напишите тут ваш код
        }

        for(int i = 0; i < 9; i++) {
            if(arrayList.get(i).equals(arrayList.get(i+1))) {
                count++;
            } else if(!arrayList.get(i).equals(arrayList.get(i+1))) {
                if(count > count2)
                    count2 = count;
                count = 1;
            }
        }

        if(count > count2) {
            System.out.println(count);
        } else
            System.out.println(count2);
     }
}