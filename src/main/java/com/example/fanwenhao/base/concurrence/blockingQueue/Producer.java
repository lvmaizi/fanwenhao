package com.example.fanwenhao.base.concurrence.blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Producer {
    private BlockingQueue blockingQueue;

    public void product(){
        while (true){
            try {
                blockingQueue.put("");
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "生产了一个");
        }
    }
    public void setBlockingQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
}
