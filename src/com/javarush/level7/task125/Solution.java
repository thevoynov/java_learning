package com.javarush.level7.task125;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
            //напишите тут ваш код
        }

        System.out.println("Бум!");
    }
}