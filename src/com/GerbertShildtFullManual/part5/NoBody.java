package com.GerbertShildtFullManual.part5;

class NoBody {
    public static void main(String args[]) {
        int i, j;
        i = 100;
        j = 200;

        //  Рассчитать среднее значение переменных i и j;
        while (++i < --j);
        System.out.println("Среднее значение равно " + i);
    }
}
