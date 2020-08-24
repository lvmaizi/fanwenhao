package com.example.fanwenhao.base.concurrence;

import java.util.concurrent.atomic.AtomicInteger;

public class shareUpdate {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        int s = atomicInteger.get();
                        if(atomicInteger.compareAndSet(s,s+2)){
                            break;
                        }
                    }
                    if(atomicInteger.get() == 200){
                        System.out.println(System.currentTimeMillis()-start);
                    }
                }
            }).start();
        }
    }
}
