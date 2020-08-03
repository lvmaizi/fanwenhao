package com.example.fanwwenhao.base.concurrence;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(1);
        System.out.println(atomicInteger.get());
        atomicInteger.compareAndSet(2,1);
        System.out.println(atomicInteger.get());
        System.out.println("ss");
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(new int [2]);
        AtomicReference atomicReference = new AtomicReference();
//        atomicReference.compareAndSet()
    }
}
