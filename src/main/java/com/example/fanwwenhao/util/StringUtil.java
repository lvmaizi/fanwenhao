package com.example.fanwwenhao.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Date 2020/4/2 16:27
 * @Version 1.0
 */
public class StringUtil {
    public static void main(String[] args) {
        String url = "http://172.12.1.123/test.txt";
        Pattern pattern = Pattern.compile(".");
        Matcher matcher = pattern.matcher(url);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}