package com.example.fanwenhao.arithmetic.huawei;

import java.util.Arrays;

/**
 * @Date 2020/7/23 17:35
 * @Version 1.0
 */
public class _5_4 {
    public static void main(String[] args) {
        String input = "123,546,8,32";
        String[] s =input.split(",");
        Arrays.sort(s);
        StringBuffer rs = new StringBuffer();
        for (int i=s.length-1;i>=0;i--){
            rs.append(s[i]);
        }
        System.out.println(rs);
    }
}
