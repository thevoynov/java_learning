package com.javarush.level9.task63;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }


        //напишите тут ваш код
    }
}