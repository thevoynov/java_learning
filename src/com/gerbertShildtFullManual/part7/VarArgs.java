package com.gerbertShildtFullManual.part7;

//  продемонстрировать применение аргументов
//  переменной длины

class VarArgs {
    //  теперь метод vaTest() объявляется с аргументами
    //  переменной длинны
    static  void vaTest(int ... v) {
        System.out.print("Количество аргументов: " + v.length
                + " Содержимое: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        //  обратите внимание на возможные способы вызова
        //  метода vaTest() с аргументами переменной длины
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
