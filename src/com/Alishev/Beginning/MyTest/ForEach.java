package com.Alishev.Beginning.MyTest;

class ForEach {
    public static void main(String[] args) {
        int[] a = {3, 6, 7};
        String[] s0 = {"Один", "Пять", "Девять"};
        int sum = 0;
        for(int x: a)
            sum = sum + x;
        System.out.println("sum = " + sum);

        for(String s: s0)
            System.out.println("String = " + s);

    }
}
