package com.javarush.test3;

/*
Thread.currentThread - всегда возвращает текущую нить
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }
    public static void main(String[] args) {
        Thread3 thread3 = new Thread3();
        thread3.start();
    }

    public static class Thread1 extends Thread {
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static class Thread3 extends Thread {
        public void run() {
            try {
                for(;;) {

                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        public void run() {
            while (!isInterrupted()) {

            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class Thread5 extends Thread {
        public void run() {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String s = "null";
            Integer integer = 0;
            while (!s.equals("N")){
                try {
                    s = reader.readLine();
                    integer = integer + Integer.parseInt(s);
                    System.out.println(integer);
                } catch (NumberFormatException e) {
                    System.out.println(integer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

interface Message {
    void showWarning();
}
