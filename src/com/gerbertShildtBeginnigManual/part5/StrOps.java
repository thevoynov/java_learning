package com.gerbertShildtBeginnigManual.part5;
//  некоторые операции над строками
class StrOps {
    public static void main(String args[]) {
        String str1 = "Java - лидер интернета";
        String str2 = new String(str1);
        String str3 = "Строки Java еффективны";
        int results, idx;
        char ch;

        System.out.println("Длина str1: " + str1.length());
        //  Отображение строки str1 посимвольно
        for(int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();

        if(str1.equals(str2))
            System.out.println("str1 эквивалентна str2");
        else
            System.out.println("str1 не эквивалентана str2");

        if(str1.equals(str3))
            System.out.println("str1 эквивалентна str3");
        else
            System.out.println("str1 не эквивалентана str3");

        results = str1.compareTo(str3);
        if(results == 0)
            System.out.println("str1 и str3 равны");
        else if(results < 0)
            System.out.println("str1 меньше str3");
        else
            System.out.println("str1 больше str3");

        //  Присваивание переменной str2 новой строки
        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Индекс первого вхождения One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индекс последного вхождения One: " + idx);
    }
}
