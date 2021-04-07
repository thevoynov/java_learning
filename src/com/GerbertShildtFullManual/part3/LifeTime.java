package com.GerbertShildtFullManual.part3;

class LifeTime {
    public static void main(String args[]) {
        int x;

        for(x = 0; x < 3; x++) {
            int y = -1; //  переменная у инициалиализируется при
                        //  каждом вхождение в блок кода
            System.out.println("y равно: " + y);
                        //  здесь всегда выводиться значение -1
            y = 100;
            System.out.println("y теперь равно: " + y);


        }
        int a = 150;
        System.out.println("a теперь равно: " + (byte) a);
    }
}
