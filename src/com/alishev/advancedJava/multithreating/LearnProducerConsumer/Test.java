package com.alishev.advancedJava.multithreating.LearnProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue<>(10);
    }
}
