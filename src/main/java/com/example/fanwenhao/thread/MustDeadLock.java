package com.example.fanwenhao.thread;

import java.util.concurrent.CountDownLatch;

public class MustDeadLock {
    public static void main(String[] args) {

        Object o = new Object();
        Object o1 = new Object();

        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch1 = new CountDownLatch(1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o){
                    countDownLatch.countDown();
                    try {
                        countDownLatch1.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o1){

                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o1){
                    countDownLatch1.countDown();
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o){

                    }
                }
            }
        }).start();
    }
}
