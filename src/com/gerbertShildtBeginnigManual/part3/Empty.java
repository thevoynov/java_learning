package com.gerbertShildtBeginnigManual.part3;

public class Empty {
    public static void main(String args[]) {
        int i;

        for(i = 0; i < 10; ) {          //  отсутсвует итерационное выражение
            System.out.println("Проход #" + i);
            i++;   //   инкрементирование переменной цикла
        }
    }
}
