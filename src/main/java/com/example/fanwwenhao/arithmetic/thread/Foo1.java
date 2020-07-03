package com.example.fanwwenhao.arithmetic.thread;

/**
 * @Date 2020/7/2 11:06
 * @Version 1.0
 */
public class Foo1 {


    private Object object = new Object();
    private volatile boolean two = false;
    private volatile boolean three = false;

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        synchronized (object){
            printFirst.run();
            two = true;
            object.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        synchronized (object){
            while (two == false)object.wait();
            printSecond.run();
            three=true;
            object.notifyAll();
        }

    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        synchronized (object){
            while(three==false)object.wait();
        }
        printThird.run();
    }
}
