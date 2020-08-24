package com.example.fanwenhao.base.concurrence;

import java.util.concurrent.TimeUnit;

/**
 * @Date 2020/5/25 9:50
 * @Version 1.0
 */
public class SynchronizedTest {
    static Object object = new Object();

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (object){
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("lalala");
            }
        }).start();
        TimeUnit.SECONDS.sleep(2);
        new Thread(() -> {
            synchronized (object){
                object.notify();
                System.out.println("notify");
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
