package com.gerbertShildtBeginnigManual.part3;

class MySwitch {
    public static void main(String args[]) {

        for(int i = 0; i <= 5; i++)
            switch (i) {
                case 1:
                case 2:
                case 3:
                    System.out.println("i равно 1, 2 или 3");
                    break;
                case 4:
                    System.out.println("i равно 4");
                    break;
            }
    }
}