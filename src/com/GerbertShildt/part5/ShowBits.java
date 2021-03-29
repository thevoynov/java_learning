package com.GerbertShildt.part5;
//  отображение битво составляющих байт
class ShowBits {
    public static void main(String args[]) {
        int t;
        byte val;

        val = 123;
        for(t = 128; t > 0; t = t/2) {
            if((val & t) != 0) {

                System.out.print("1 ");
                System.out.println("t = " + t );
            }
            else {

                System.out.print("0 ");
                System.out.println("t = " + t );
            }
        }
    }
}
