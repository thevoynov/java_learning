package com.alishev.advancedJava.multithreating.Multithreading;

public class Test {
    public static void main(String args[]) throws InterruptedException {
/*        MyThread myThread = new MyThread();
        myThread.start();
        for(int i = 0; i < 1000; i++) {
            System.out.println(i + " Hello from main   ");*/
/*
        System.out.println("I'm going to sleep");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
           System.out.println("Ошибка InterruptedException");
        }
        System.out.println("I'm awake!");
    }*/
        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " Hello from MyThread");
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for(int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " Hello from MyThread");
        }
    }
}
