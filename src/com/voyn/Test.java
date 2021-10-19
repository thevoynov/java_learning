package com.voyn;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 22, 123};
        System.out.println(calculate(13));
        System.out.println(calculatee(5));
        doing(arr1);

    }

//    static long calculate(int n) {
//        long first = 0;
//        long second = 1;
//        long result = n;
//
//        for (int i = 1; i < n; i++) {
//            result = first + second;
//            first = second;
//            second = result;
//        }
//        return result;
//    }

    static long calculate(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return calculate(n - 1) + calculate(n - 2);
    }

    static int calculatee(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    static void doing (int[] array) {
        boolean flag = false;
        int temp = 0;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = false;
                }
            }
        }
    }

}
