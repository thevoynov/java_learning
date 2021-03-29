package com.GerbertShildtBeginnigManual.part3;
// Демонстрация использования цикла while
class WhileDemo {
    public static void main(String args[]) {
        char ch;
        //  Вывод букв английского алфавита, используя цикл while
        ch = 'a';
        while(ch <= 'z') {
            System.out.println(ch);
            ch++;
        }
    }
}
