package com.gerbertShildtFullManual.part11.MultiThreadDemo;

public class DemoJoin {
    public static void main(String args[]) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");
        NewThread ob3 = new NewThread("Три");

        System.out.println("Поток один запущен: " + ob1.t.isAlive());
        System.out.println("Поток два запущен: " + ob2.t.isAlive());
        System.out.println("Поток три запущен: " + ob3.t.isAlive());

        //  ожидать завершения потоков исполнения
        try {
            System.out.println("Ожидать завершения потоков");
            ob1.t.join();
            ob1.t.join();
            ob1.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Поток один запущен: " + ob1.t.isAlive());
        System.out.println("Поток два запущен: " + ob2.t.isAlive());
        System.out.println("Поток три запущен: " + ob3.t.isAlive());

        System.out.println("Главный поток завершён.");
    }
}
