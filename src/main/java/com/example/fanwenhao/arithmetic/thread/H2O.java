package com.example.fanwenhao.arithmetic.thread;

import java.util.concurrent.Semaphore;

public class H2O {

    public H2O() {

    }

    Semaphore semaphore1 = new Semaphore(2);
    Semaphore semaphore2 = new Semaphore(1);

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        semaphore1.acquire();
        semaphore1.acquire();
        semaphore2.acquire();
        releaseHydrogen.run();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        semaphore2.acquire();
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        semaphore1.release();
        semaphore1.release();

    }
}
