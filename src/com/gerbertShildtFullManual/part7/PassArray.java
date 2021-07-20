package com.gerbertShildtFullManual.part7;

class PassArray {
    static void vaTest(int v[]) {
        System.out.print("Количество аргументов: " + v.length
                + " Содержимное: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        //  обратите внимание на порядок создлания массива
        //  для хранения аргументов

        int n1[] = {10};
        int n2[] = {1, 2, 3};
        int n3[] = {};
        vaTest(n1); //  1 аргумент
        vaTest(n2); //  3 аргумента
        vaTest(n3); //  без аргументов
    }
}
