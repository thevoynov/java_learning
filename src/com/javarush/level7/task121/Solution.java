package com.javarush.level7.task121;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {
            arrayInt.add(Integer.parseInt(reader.readLine()));
        }
        for(int j = 9; j > -1; j--) {
            System.out.println(arrayInt.get(j));
        }
        //напишите тут ваш код
    }
}
