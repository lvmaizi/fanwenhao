package com.example.fanwwenhao.common;

import java.io.Serializable;

public class JvmTest implements  Cloneable, Serializable {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("哈哈");
        System.gc();
        System.getProperty("fwh");
        System.out.println(System.getProperty("fwh"));
        System.out.println(Runtime.getRuntime().maxMemory()/1000/1000);
        new JvmTest().clone();
    }
}
