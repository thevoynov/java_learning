package com.alishev.advancedJava.multithreating.LearnCollableAndFuture;

import java.util.Random;
import java.util.concurrent.*;

public class Test {
//    private static int result;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        executorService.submit(new Runnable() {
        Future<Integer> future = executorService.submit(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");
            Random random = new Random();

            int randomValue = random.nextInt();

            if(randomValue < 5)
                throw new Exception("Something bad happened");
            return random.nextInt(10);
            /*
            @Override
            public void run() {
                System.out.println("Starting");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished");
                result = 5;
            }*/



        });

        executorService.shutdown();

        try {
            int result = future.get();  // get ждёт окончания
                                        // выполнения потока
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }

/*        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }


}
