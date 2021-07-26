package com.alishev.advancedJava.multithreating.LearnSemaphore;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
 /*       Semaphore semaphore = new Semaphore(10);


        try {
            semaphore.acquire();    //  когда начинаем взаимодействие
                                    // с ресусом
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release();        // когда закончили взаимодействие
                                    // с ресурсом, отдаёт релиз
        System.out.println(semaphore.availablePermits());*/

        ExecutorService executorService
                = Executors.newFixedThreadPool(5);
        Connection connection = Connection.getConnection();


        for (int i = 0; i < 5; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            executorService.shutdown();

            executorService.awaitTermination(1, TimeUnit.DAYS);
        }


    }
}

//  singleton
class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(2);
    private Connection () {

    }

    public static Connection getConnection() {
        return connection;
    }

    public void work () throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        }   finally {
            semaphore.release();
        }

    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }

        Thread.sleep(5000);

        synchronized (this) {
            connectionsCount--;
        }
    }
}