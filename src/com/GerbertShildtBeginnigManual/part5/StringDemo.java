package com.GerbertShildtBeginnigManual.part5;

public class StringDemo {
    public static void main(String args[]) {
        //  Различные способы объявления строк
        String str1 = new String("В Java строки - это объекты");
        String str2 = "Их можно создавать разными способами";
        String str3 = new String(str2);
        String str4 = str1;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
