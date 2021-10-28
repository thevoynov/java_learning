package com.javarush.level9.task111;

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public static void divideByZero() throws NullPointerException {
        int a = 2 / 0;
        System.out.println(a);
    }
}