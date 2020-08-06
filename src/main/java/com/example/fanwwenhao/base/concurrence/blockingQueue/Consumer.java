package com.example.fanwwenhao.base.concurrence.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer {
    private BlockingQueue blockingQueue;


    public void consume(){
        while (true){
            try {
                blockingQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "消费了一个");
        }
    }

    public void setBlockingQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
}
