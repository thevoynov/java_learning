package com.javarush.level9.task23;

public class Solution {
    public static void main(String[] args) {


        method1();


    }

    public static int method1() {

        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];

        method2();

        return stackTraceElement.getLineNumber();
    }

    public static int method2() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];

        method3();

        return stackTraceElement.getLineNumber();
    }

    public static int method3() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];

        method4();

        return stackTraceElement.getLineNumber();
    }

    public static int method4() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];

        method5();

        return stackTraceElement.getLineNumber();
    }

    public static int method5() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];


        return stackTraceElement.getLineNumber();
    }
}