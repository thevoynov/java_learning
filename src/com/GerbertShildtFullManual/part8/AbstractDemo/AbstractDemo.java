package com.GerbertShildtFullManual.part8.AbstractDemo;

//  Простой пример абстракции
abstract class A {
    abstract void callme();

    //  абстрактные классы всё же могут
    //  содержать конкретные методы

    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}

class B extends A {
    void callme() {
        System.out.println("Реализация метода callme() в классе B.");
    }
}

class AbstractDemo {
    public static void main(String args[]) {
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}
