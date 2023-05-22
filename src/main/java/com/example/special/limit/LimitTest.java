package com.example.special.limit;

import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.TimeUnit;

public class LimitTest {
    public static void main(String[] args) {
        new LimitTest().testAcquire();
    }
    public void testAcquire() {
        RateLimiter limiter = RateLimiter.create(1);

        for(int i = 1; i < 10; i = i + 2 ) {
            double waitTime = limiter.acquire(i);
            System.out.println("cutTime=" + System.currentTimeMillis() + " acq:" + i + " waitTime:" + waitTime);
        }
    }
}
