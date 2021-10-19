package com.voyn;

public class Bubble {
    public static void main(String[] args) {
        //setting arrays and variables
        int[] arr1 = {1, 10, 6, 20, 50, 32, 54};
        int[] arr2 = {11, 120, 321, 35, 234, 7, 3};
        int[] arr3 = new int[arr1.length + arr2.length];
        int j =0;
        boolean flag = true;
        //array merge
        for(int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for(int i = arr1.length; i < arr1.length + arr2.length; i++) {
            j++;
            arr3[i] = arr2[j-1];
        }
        //selection sort
        int buf = 0;
        for(int k = 0; k < arr3.length; k++) {
            for (int i = 0; i < arr3.length - 1; i++) {
                if (arr3[i] > arr3[i + 1]) {
                    buf = arr3[i];
                    arr3[i] = arr3[i + 1];
                    arr3[i + 1] = buf;
                }
            }
        }
        for(int i = 0; i < arr3.length; i++)
            System.out.println(arr3[i]);
    }
}
