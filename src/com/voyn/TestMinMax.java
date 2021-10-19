package com.voyn;

public class TestMinMax {
    public static void main(String[] args) {
        int[] arr = {1, 3, 10, 15, 32, 23, 100, 50, 23};
        int max = Integer.MIN_VALUE;;
        int min = Integer.MAX_VALUE;
        for(int i : arr) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }
        System.out.println(max);
        System.out.println(min);
    }
}

