package com.gerbertShildtFullManual.part11.CurrentThreadDemo;

class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Текущий поток исполнения: " + t);

        //  изменить имя потока исполнения
        t.setName("My Thread");
        System.out.println("После изменения имени потока: " + t);

        try {
            for (int n = 19; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
