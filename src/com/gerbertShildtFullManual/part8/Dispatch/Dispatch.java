package com.gerbertShildtFullManual.part8.Dispatch;

class A {
    void callme() {
        System.out.println("В методе callme() из класса А");
    }
}

class B extends  A {
    //  переопределить мето callme()
    void callme() {
        System.out.println("В методе callme() из класса B");
    }
}

class C extends A {
    //  переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса С");
    }
}

class Dispatch {
    public static void main(String args[]) {
        A a = new A();  //  объект класса А
        B b = new B();  //  объект класса B
        C c = new C();  //  объект класса C

        A r;    //  получить сылку на объект типа A

        r = a;  //  пременная типа r ссылается на объект типа А
        r.callme();
        r = b;  //  пременная типа r ссылается на объект типа B
        r.callme();
        r = c;  //  пременная типа r ссылается на объект типа C
        r.callme();
    }
}
