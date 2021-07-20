package com.gerbertShildtFullManual.part8.UseSuper;

//  использовать ключевое слово super с целью
//  предоставить сокрытие имён

class A {
    int i;
}

//  создать подкласс путём расширения класса A

class B extends A {
    int i;  //  этот член i скрывает член i из класса А

    B(int a, int b) {
        super.i = a;    //  член из класса А
        i = b;          //  член из класса B
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String args[]) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}
