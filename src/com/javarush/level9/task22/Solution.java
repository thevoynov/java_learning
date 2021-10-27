package com.javarush.level9.task22;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        method2();
        return stackTraceElement.getMethodName();//напишите тут ваш код
    }

    public static String method2() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        method3();
        return stackTraceElement.getMethodName();
        //напишите тут ваш код
    }

    public static String method3() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        method4();
        return stackTraceElement.getMethodName();
    }

    public static String method4() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        method5();
        return stackTraceElement.getMethodName();
    }

    public static String method5() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        return stackTraceElement.getMethodName();
    }
}
