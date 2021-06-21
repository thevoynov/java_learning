package com.GerbertShildtFullManual.part7;

//  продемонстрировать применение аргументов
//  переменной длины

class VarArgs2 {
    //  теперь метод vaTest() объявляется с аргументами
    //  переменной длинны
    static  void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length
                + " Содержимое: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        //  обратите внимание на возможные способы вызова
        //  метода vaTest() с аргументами переменной длины
        vaTest("Один параметр переменный длины ",10);

    }
}