package com.example.fanwenhao.arithmetic.thread;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class FizzBuzz {
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    Semaphore semaphore1 = new Semaphore(0);
    Semaphore semaphore2 = new Semaphore(0);
    Semaphore semaphore3 = new Semaphore(0);
    Semaphore semaphore4 = new Semaphore(0);

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 != 0){
                semaphore2.acquire();
                semaphore3.acquire();
                semaphore4.acquire();
                printFizz.run();
            }else {
                semaphore1.release();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 1; i <= n; i++){
            if(i % 5 == 0 && i % 3 != 0){
                semaphore1.acquire();
                semaphore3.acquire();
                semaphore4.acquire();
                printBuzz.run();
            }else {
                semaphore2.release();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                semaphore1.acquire();
                semaphore2.acquire();
                semaphore4.acquire();
                printFizzBuzz.run();
            }else {
                semaphore3.release();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++){
            if(i % 3 != 0 && i % 5 != 0){
                semaphore1.acquire();
                semaphore2.acquire();
                semaphore3.acquire();
                printNumber.accept(i);
            }else {
                semaphore4.release();
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(20);
        new Thread(()->{
            try {
                fizzBuzz.fizz(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("fizz");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                fizzBuzz.buzz(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("buzz");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                fizzBuzz.fizzbuzz(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("fizzbuzz");
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                fizzBuzz.number(new IntConsumer() {

                    @Override
                    public void accept(int value) {
                        System.out.println(value);
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
