package com.example.fanwenhao.base.concurrence.blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingTest {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new LinkedBlockingQueue();
        new Thread(() ->{
            Consumer c = new Consumer();
            c.setBlockingQueue(blockingQueue);
            c.consume();
        }).start();
        new Thread(() ->{
            Consumer c = new Consumer();
            c.setBlockingQueue(blockingQueue);
            c.consume();
        }).start();
        new Thread(() ->{
            Producer p = new Producer();
            p.setBlockingQueue(blockingQueue);
            p.product();
        }).start();
    }
}
