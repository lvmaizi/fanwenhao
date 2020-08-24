package com.example.fanwenhao.arithmetic.thread;

/**
 * @Date 2020/7/2 10:59
 * @Version 1.0
 */
public class Foo {
    private volatile boolean two;
    private volatile boolean three;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        two = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (true!=two){}
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        three = true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (true!=three){}
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
