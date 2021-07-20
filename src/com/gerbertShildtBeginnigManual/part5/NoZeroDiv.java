package com.gerbertShildtBeginnigManual.part5;

class NoZeroDiv {
    public static void main(String args[]) {
        int results;

        for(int i = -5; i < 6; i++) {
            results = i != 0 ? 100 / i : 0;
            if(i != 0)
                System.out.println("100 / " + i + " равно " + results);
        }
    }
}
