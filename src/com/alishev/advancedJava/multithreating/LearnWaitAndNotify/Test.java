package com.alishev.advancedJava.multithreating.LearnWaitAndNotify;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        WaitAndNotify wn = new WaitAndNotify();

        Object object = new Object();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer " +
                    "thread started...");
            wait();
            System.out.println("Producer thread " +
                    "resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for " +
                    "return a key pressed");
            scanner.nextLine();
            notify();
        }
    }
}