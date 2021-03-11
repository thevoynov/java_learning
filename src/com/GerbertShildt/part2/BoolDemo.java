package com.GerbertShildt.part2;
/*
    Демонстрация использования логическх значений
 */
class BoolDemo {
    public static void main(String args[]) {
        boolean b = false;
        System.out.println("Значение b: " + b);
        b = true;
        System.out.println("Значения b: " + b);
        //  Логическое значения можно использовать для
        //  управления условной иснтрукцей if
        if(b)
            System.out.println("Эта инструкция выпонляется");
        b = false;
        if(b)
            System.out.println("Эта инструкция не выполняется");
        //  В результате сравнения получается логическое значение
        System.out.println("Результат сравнения 10 > 9: " + (10 > 9));
    }
}