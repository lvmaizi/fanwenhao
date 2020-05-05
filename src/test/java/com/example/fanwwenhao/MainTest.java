package com.example.fanwwenhao;

import com.example.fanwwenhao.common.JvmTest;

/**
 * @Author fanwenhao
 * @Date 2019/11/4 20:22
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader()
                .getResource(""));
        System.out.println(MainTest.class.getClassLoader()
                .getResource(""));
        System.out.println(String.class.getResource("/"));
        //JvmTest.main(new String[2]);
        System.out.println("888");
    }
}
