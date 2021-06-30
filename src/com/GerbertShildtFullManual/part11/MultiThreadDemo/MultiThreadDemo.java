package com.GerbertShildtFullManual.part11.MultiThreadDemo;

//  Создать несколько потоков исполнения

class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();  //  запустить поток на исполенение
    }

    //  Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершён.");
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("Один");
        new NewThread("Два");
        new NewThread("Три");
        try {
            //  ожидать завершения других потокв исполнения
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный прирк прерван.");
        }
        System.out.println("Главный поток завершён");
    }
}
