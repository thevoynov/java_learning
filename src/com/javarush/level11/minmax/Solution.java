package com.javarush.level11.minmax;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] < min) {
                min = inputArray[i];
            }

            if(inputArray[i] > max) {
                max = inputArray[i];
            }


        }


        if (inputArray == null || inputArray.length == 0) {

            return new Pair(null, null);
        } else {
            return new Pair(min, max);
        }

        // напишите тут ваш код

//        return new Pair(0, 0);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
