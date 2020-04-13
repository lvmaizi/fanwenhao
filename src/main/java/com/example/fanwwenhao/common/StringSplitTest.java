package com.example.fanwwenhao.common;

/**
 * @Date 2020/1/3 17:09
 * @Version 1.0
 */
public class StringSplitTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://49.234.7.155:3306/fwh?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        String[] strings = url.split(":|=|&|/|\\?");
        System.out.println();
    }
}
