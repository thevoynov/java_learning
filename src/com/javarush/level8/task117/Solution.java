package com.javarush.level8.task117;

public class Solution {
    public static int A = 5;
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public void main(String[] args) {
    }

    public static int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}