package com.voyn;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getRadix("121"));        //expected output: [3, 27, 13, 15]
        System.out.println(getRadix("2332"));        //expected output: [6]
        System.out.println(getRadix("-2332"));       //expected output: []
    }

    private static Set<Integer> getRadix(String number) {
        // С помощью Biginteger конвертируем переданное число в желаемую систему исчисления (от 2 до 36 включительно)
        Set<Integer> mySet = new HashSet<>();
        BigInteger num = null;
        try {
            num = new BigInteger(number);
        } catch (Exception e) {
            return mySet;
        }
        String convertedNumber = "";
        String reversed = "";
        for (int i = 2; i <= 36; i++) {
            convertedNumber = num.toString(i); // вот тут происходит конвертация в систему исчисления i
            reversed = new StringBuffer(convertedNumber).reverse().toString(); // переворачиваем полученное число
            // Сравниваем оба числа и смотрим палиндром ли это
            if (convertedNumber.equals(reversed)) {
                mySet.add(i);
            }
        }
        return mySet;
    }
}