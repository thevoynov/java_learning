package com.GerbertShildtFullManual.part10;

class ChainExcDemo {
    static void demoproc() {
        //  создать исключение
        NullPointerException e = new NullPointerException("верхний уровен");
        //  добавить причину исключения
        e.initCause(new ArithmeticException("причина"));

        throw  e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            //  вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);

            //  вывести исключение, послужившее причной
            //  для исключения верхнего уровня
            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
