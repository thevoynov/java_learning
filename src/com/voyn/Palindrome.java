package com.voyn;

import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]) {
        System.out.println("Enter a integer number : ");

        int p = new Scanner(System.in).nextInt();

        if (isPalindrome(p)) {

            System.out.println(p
                    + " is a palindrome");
        } else {
            System.out.println(p
                    + " isn't a palindrome");
        }
    }

    public static boolean isPalindrome(int i) {
        int r = 0;
        int p = i;

        while (p != 0) {
            int mem = p % 10;
            r = r * 10 + mem;
            p = p / 10;
        }

        if (i== r) {
            return true;
        }
        return false;
    }
}