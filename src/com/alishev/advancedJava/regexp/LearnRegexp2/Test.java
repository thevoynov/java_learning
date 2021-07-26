package com.alishev.advancedJava.regexp.LearnRegexp2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String a = "Hello there hey";

        String[] words = a.split(" ");
        System.out.println(Arrays.toString(words));
        String b = "Hello there hey";

        String modifedString = b.replace(" ",".");
        System.out.println(modifedString);

    }
}
