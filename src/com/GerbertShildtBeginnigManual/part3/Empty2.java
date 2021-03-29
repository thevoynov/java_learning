package com.GerbertShildtBeginnigManual.part3;

public class Empty2 {
    public static void main(String args[]) {
        int i = 0;  // выносим инициализацию за пределы цикла

        for(; i < 10; ) {          //  отсутсвует итерационное выражение
            System.out.println("Проход #" + i);
            i++;   //   инкрементирование переменной цикла
        }
    }
}
