package com.GerbertShildt.testcases;

class DoWhile {
    public static void main (String args[]) {
        byte a = 0, b = 0, c = 0;

        do {
            a++;
            System.out.println("Part" + a);
            for (b = 0; b < 3; b++) {
                c = 1;
                double d = (double) a / b;
                System.out.println(a + "/" + b + "=" + d);
                while (c < 3) {
                    c++;
                    double e = (double) b + c/d;
                    System.out.println(c + "/" + d +"" + e);
                }
            }
        }   while (a < 30);
    }
}