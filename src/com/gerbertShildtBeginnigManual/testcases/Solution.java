package com.gerbertShildtBeginnigManual.testcases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.lang.reflect.Array;

/*
Консоль-копилка
*/

public class Solution {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a + b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a - b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a * b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (double) a / b;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return (double) a * (1.0 - ((double) b / 100));
    }

    public static void main(String[] args) {
        System.out.println(percent(400,50));
    }
}








//        int size = 0;
//        int[] arr = new int[size+1];
//        System.out.println("arr size " + size);
//        int[] age = {2, 6, 16, 54};

//        for (int i = 1; i < age.length; i++) max = Math.max(max, age[i]);


//        while (true) {
//
//            arr[size] = Integer.parseInt(reader.readLine());
////            if(size >= 1) {
////                System.out.println(arr[size - 1] > arr[size] ? arr[size] : arr[size - 1]);
////                System.out.println("[size], [size-1] = " + size + ", " + (size - 1));
////                System.out.println("arr[size], arr[size-1] = " + arr[size] + ", " + arr[size - 1]);
////            }
//            System.out.println("arr[" + size + "] " + arr[size]);
//
////            if(size >= 1) {
////                int diff = arr[size - 1] > arr[size] ? arr[size-1] : arr[size];
////                int c = arr[0];
////                int d = arr[1];
////
////                System.out.println(" c = " + c + " d = " + d);
////                System.out.println("MAX = " + diff);
////                System.out.println("[size], [size-1] = " + size + ", " + (size - 1));
////            }
//            size++;
//            if(size == 10)
//                for(int i = 0; i <= 10; i++) {
//                    System.out.println("arr[" + i + "] = " + arr[i]);
//                }
//            System.out.println("size " + size);
//        }

        //напишите тут ваш код
//    }
//}