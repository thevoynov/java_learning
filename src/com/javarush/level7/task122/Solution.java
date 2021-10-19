package com.javarush.level7.task122;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for(int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }

        for(int j = 0; j < m; j++) {
            list.add(list.get(0));
            list.remove(list.get(0));
        }

        for(String s : list) {
            System.out.println(s);
        }
    }
}