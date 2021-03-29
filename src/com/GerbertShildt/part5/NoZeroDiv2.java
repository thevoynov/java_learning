package com.GerbertShildt.part5;

public class NoZeroDiv2 {
    public static void main(String args[]) {
        for (int i = -5; i < 5; i++)
            if(i != 0 ? true : false)
                System.out.println("100 / " + i + " равно " + 100/i);
    }
}
