package com.javarush.level9.task64;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {

            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //напишите тут ваш код
    }
}