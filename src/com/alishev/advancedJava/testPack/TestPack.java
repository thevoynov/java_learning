package com.alishev.advancedJava.testPack;

public class TestPack {
    int in = 100;
    public static void main(String args[]) throws InterruptedException {
        TestPack testPack = new TestPack();
        testPack.Doing();

    }

    public void DoDo() {
        in--;
    }

    public synchronized void Doing() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 110; i++)
                    DoDo();
                System.out.println("thread1 " + in);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++)
                    DoDo();
                System.out.println("thread2 " + in);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(in);
    }

}
