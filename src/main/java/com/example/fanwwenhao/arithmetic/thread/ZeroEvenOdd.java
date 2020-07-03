package com.example.fanwwenhao.arithmetic.thread;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * @Date 2020/7/2 16:21
 * @Version 1.0
 */
public class ZeroEvenOdd {
    private int n;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        printNumber.accept(0);

    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        printNumber.accept(0);
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {

    }
}
