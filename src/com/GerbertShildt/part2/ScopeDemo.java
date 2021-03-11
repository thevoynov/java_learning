package com.GerbertShildt.part2;

class ScopeDemo {
    public static void main(String args[]) {
        int x;  //  Эта переменная доступна для всего кода в
                //  в методе main
        x = 10;
        if(x == 10) {
            int y = 20; //  Эта переменная доступна только
                        //  в данном блоке
            //  Обе переменные "x" и "y" доступны в данном блоке кода
            System.out.println("x и y: " + x + " " + y);
            x = y + 2;
        }
        //y = 100; // Ошибка в данном месте переменная "y" недоступна
        //  А переменная "x" по-прежднему доступна
        System.out.println("x - это " + x);
    }
}
