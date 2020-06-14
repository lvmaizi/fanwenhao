package com.example.fanwwenhao.thread;

import java.util.concurrent.*;

/**
 * @Date 2020/6/3 16:26
 * @Version 1.0
 */
public class ThreadCache {
    public static void main(String[] args) {
        ExecutorService t = Executors.newFixedThreadPool(3);
        Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();
        Executors.newWorkStealingPool();
        t.submit(()->{
            try {
                TimeUnit.SECONDS.sleep(300);
            }catch (Exception e){}
        });

    }
}