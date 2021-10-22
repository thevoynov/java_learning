package com.javarush.level8.task115;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char[] ch = string.toCharArray();
        ch[0] -= 32;

        for(int j = 0; j < ch.length; j++) {
            if(ch[j] == 32) {
                ch[j+1] -= 32;
            }
        }

        System.out.println(ch);
        //напишите тут ваш код
    }
}