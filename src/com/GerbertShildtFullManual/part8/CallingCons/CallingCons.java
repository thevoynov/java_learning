package com.GerbertShildtFullManual.part8.CallingCons;
//  продемонстрировать порядко вызова конструкторов
//  создать супер класс

class A {
    A() {
        System.out.println("В конструкторе A.");
    }
}

//  создать подкласс путём расширения класса A
class B extends A {
    B() {
        System.out.println("В конструкторе B.");
    }
}
//  создать подкласс путём расширения класса B
class C extends B {
    C() {
        System.out.println("В конструкторе C.");
    }
}

class CallingCons {
    public static void main(String args[]) {
        C c = new C();
    }
}
