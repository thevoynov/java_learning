package com.gerbertShildtBeginnigManual.part3;

public class Break2 {
    public static void main(String args[])
        throws java.io.IOException {
        char ch;

        for(; ; ) {
            ch = (char) System.in.read();   //  получение символа
                                            //  с клавиатуры
            byte c = 0;
            c++;
            System.out.println("c = " + c);           //  с клавиатуры
            if(ch == 'q')
                break;
        }
        System.out.println("Вы нажали клавишу q!");
    }
}
