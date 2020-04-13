package com.example.fanwwenhao.thread;

import java.util.concurrent.TimeUnit;

/**
 * @Date 2020/4/2 16:38
 * @Version 1.0
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
       new Thread(new TimeWaiting(),"TimeWaiting").start();
       new Thread(new Waiting(),"Waiting").start();
       new Thread(new Blocked(),"Block-1").start();
       new Thread(new Blocked(),"Block-2").start();
    }
    static class TimeWaiting implements Runnable{
        @Override
        public void run() {
            while (true){
                second(100);
            }
        }
    }
    static class Waiting implements Runnable {
        @Override
        public void run() {
            while (true){
                synchronized (Waiting.class){
                    try {
                        Waiting.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    static class Blocked implements Runnable {
        @Override
        public void run() {
            synchronized (Blocked.class){
                while (true){
                    second(100);
                }
            }
        }
    }
    public static void second(long seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
