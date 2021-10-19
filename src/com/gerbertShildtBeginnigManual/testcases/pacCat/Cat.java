package com.gerbertShildtBeginnigManual.testcases.pacCat;

public class Cat {
    public static void main(String[] args) {

    }

    protected void finalize() throws Throwable {
        System.out.println("A cat was destroyed");
    }
    //напишите тут ваш код

}

class Dog {
    protected void finalize() throws Throwable {
        System.out.println("A cat was destroyed");
    }
    //напишите тут ваш код
}
