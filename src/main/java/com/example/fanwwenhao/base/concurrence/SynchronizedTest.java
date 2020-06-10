package com.example.fanwwenhao.base.concurrence;

/**
 * @Date 2020/5/25 9:50
 * @Version 1.0
 */
public class SynchronizedTest {
    public synchronized void test(){

        System.out.println("ss");
        test1();
    }
    public void test1(){
        System.out.println(2);
    }
}
