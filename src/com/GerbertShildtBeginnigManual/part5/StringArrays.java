package com.GerbertShildtBeginnigManual.part5;
//  Демонстрация
class StringArrays {
    public static void main(String args[]) {
        String strs[] = {"Эта", "строка", "является", "текстом."};
        System.out.println("Исходный массив: ");
        for(String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");

        //  Изменение строки
        strs[2] = "также является";
        strs[3] = "текстом!";

        System.out.println("Изменённый массив: ");
        for (String s : strs)
            System.out.print(s + " ");
    }
}
