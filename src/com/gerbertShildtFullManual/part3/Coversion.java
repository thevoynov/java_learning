package com.gerbertShildtFullManual.part3;

class Coversion {
    public static void main(String args[]) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nПреобразование типа int в тип byte" +
                "\n" + "i и b " + i + " " + (b = (byte) i));
        System.out.println("\nПреобразование типа int в тип byte" +
                "\n" + "d и i " + i + " " + (i = (int) d));
        System.out.println("\nПреобразование типа int в тип byte" +
                "\n" + "d и b " + i + " " + (b = (byte) d));
        //  Когда значение 257 приводиться к типу byte, его результат
        //  будет остаток от деления 257 на 256(диапазон допустих значений типа byte)
        //  который в данном случае равен 1
    }
}
