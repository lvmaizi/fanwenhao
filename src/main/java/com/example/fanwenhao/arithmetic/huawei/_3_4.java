package com.example.fanwenhao.arithmetic.huawei;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @Date 2020/7/14 16:38
 * @Version 1.0
 */
public class _3_4 {
    //暴力解法
    public static void main(String[] args) throws IOException {
        String str = "adfei";
        int size = 2;
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<str.length();j++){
                if (set.contains(str.charAt(i)) && set.contains(str.charAt(j))){
                    if(isTrue(str.substring(i,j+1),size)){
                        System.out.println(j-i+1);
                    }
                }
            }
        }

    }
    //是否满足
    private static Set<Character> set = new HashSet(){{
        add('a');
        add('e');
        add('i');
        add('o');
        add('u');
    }};
    public static boolean isTrue(String str,int size){
        int sum = 0;
        for (int i=0;i<str.length();i++){
            if (set.contains(str.charAt(i)))continue;
            sum++;
        }
        return sum == size;
    }
}
