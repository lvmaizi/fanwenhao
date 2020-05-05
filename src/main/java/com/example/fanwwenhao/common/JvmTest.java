package com.example.fanwwenhao.common;


import java.lang.reflect.Method;

public class JvmTest {
    public static void main(String[] args) {
        Class ooo = JvmTest.class;
        new JvmTest().getClass();
        Method method;
        System.out.println("哈哈");
        System.gc();
        System.getProperty("fwh");
        System.out.println(System.getProperty("fwh"));
        System.out.println(Runtime.getRuntime().maxMemory()/1000/1000);
        new JvmTest().clone();
    }
}
