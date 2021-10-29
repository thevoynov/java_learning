package com.javarush.level9.task113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(
                                System.in));

        ArrayList<Integer> arrayList = new ArrayList<>();
        int a = 0;
        while(true) {
            try {
                a = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException | IOException e) {
                for(int i : arrayList)
                System.out.println(i);
                break;
            }
            arrayList.add(a);
        }

    }
}
