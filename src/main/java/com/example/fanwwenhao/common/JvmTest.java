package com.example.fanwwenhao.common;

public class JvmTest {
    public static void main(String[] args) {
        System.out.println("哈哈");
        System.gc();
        System.getProperty("fwh");
        System.out.println(System.getProperty("fwh"));
        System.out.println(Runtime.getRuntime().maxMemory()/1000/1000);
    }
}
