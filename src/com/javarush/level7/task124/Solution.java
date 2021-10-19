package com.javarush.level7.task124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String str = "null";

        while (!str.equals("end")) {
            str = reader.readLine();
            list.add(str);
            if(str.equals("end")) {
                list.remove(str);
                break;
            }
        }

        for(String s : list) {
            System.out.println(s);
        }
//        String str1 = "aaa";
//        String str2 = "aaa";
//        System.out.println(str1.equals(str2));




    }
}
