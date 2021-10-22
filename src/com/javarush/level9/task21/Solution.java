package com.javarush.level9.task21;


public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method2();
        return stackTraceElements; //напишите тут ваш код
    }

    public static StackTraceElement[] method2() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method3();
        return stackTraceElements; //напишите тут ваш код
    }

    public static StackTraceElement[] method3() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method4();
        return stackTraceElements;//напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        method5();
        return stackTraceElements;//напишите тут ваш код
    }

    public static StackTraceElement[] method5() {

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }
    //напишите тут ваш код

}