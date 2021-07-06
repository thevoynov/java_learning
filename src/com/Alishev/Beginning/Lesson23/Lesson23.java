package com.Alishev.Beginning.Lesson23;

public class Lesson23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.toString());
        sb.append(" friend");
        System.out.println(sb.toString());
        System.out.printf("String %-10d \n", 100000);
        System.out.printf("String %-10d \n", 10);
        System.out.printf("String %-10d \n", 100);
        System.out.printf("String %-10d \n", 1000);

        System.out.printf("String %.2f \n", 10.22222);

        //  % [10][.42f]
    }
}
