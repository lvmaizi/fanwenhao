package com.example.fanwwenhao.arithmetic.thread;

/**
 * @Date 2020/7/2 11:56
 * @Version 1.0
 */
public class FooBar {
    private int n;
    private volatile int sum =1;
    private Object object = new Object();

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {

            // printFoo.run() outputs "foo". Do not change or remove this line.
            synchronized (object){
                while (sum % 2!=1)object.wait();
                printFoo.run();
                sum=2;
                object.notify();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printBar.run() outputs "bar". Do not change or remove this line.
            synchronized (object){
                while (sum % 2==1)object.wait();
                printBar.run();
                sum=1;
                object.notify();
            }
        }
    }
}
