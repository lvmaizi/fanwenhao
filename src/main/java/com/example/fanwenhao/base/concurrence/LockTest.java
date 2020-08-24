package com.example.fanwenhao.base.concurrence;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Date 2020/6/10 14:55
 * @Version 1.0
 */
public class LockTest {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        new Thread(()->{
            reentrantLock.lock();
            System.out.println("xixi");
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("lala");
        }).start();
        TimeUnit.SECONDS.sleep(5);
        new Thread(()->{
            reentrantLock.lock();
            System.out.println("ppp");
            condition.signal();
            reentrantLock.unlock();

        }).start();
//        condition.await();

    }
}
