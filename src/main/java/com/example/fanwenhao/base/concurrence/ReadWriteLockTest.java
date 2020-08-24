package com.example.fanwenhao.base.concurrence;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Date 2020/7/29 14:36
 * @Version 1.0
 */
public class ReadWriteLockTest {
    public static void main(String[] args) {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock read = readWriteLock.readLock();
        Lock write = readWriteLock.writeLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                read.lock();
                System.out.println("读锁");
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    read.unlock();
                    System.out.println("释放读锁");
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                write.lock();
                System.out.println("写锁");
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    write.unlock();
                    System.out.println("释放写锁");
                }
            }
        }).start();
    }
}
