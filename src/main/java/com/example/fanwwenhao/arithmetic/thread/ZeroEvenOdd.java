package com.example.fanwwenhao.arithmetic.thread;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * @Date 2020/7/2 16:21
 * @Version 1.0
 */
public class ZeroEvenOdd {
    private int n;

    private Semaphore semaphore = new Semaphore(1);
    private Semaphore semaphore1 = new Semaphore(0);
    private Semaphore semaphore2 = new Semaphore(0);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0;i < n; i++){
            semaphore.acquire();
            printNumber.accept(0);
            semaphore.release();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1;i <= n; i++){
            if(i % 2 == 0){
                semaphore.release();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1;i <= n; i++){
            if(i % 2 != 0){
                semaphore.acquire();
                printNumber.accept(i);
                semaphore.release();
            }
        }
    }
}
