package com.example.fanwenhao.arithmetic.offer;

public class _58_2_ {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length())+s.substring(0,n);
    }

    public static void main(String[] args) {
        System.out.println(new _58_2_().reverseLeftWords("abcdef", 2));
    }
}
