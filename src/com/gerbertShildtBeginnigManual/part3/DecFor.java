package com.gerbertShildtBeginnigManual.part3;

class DecFor {
    public static void main (String args[]) {
        byte x;
        for(x = 100; x > -100; x -= (byte) 5)
            System.out.println(x);
    }
}