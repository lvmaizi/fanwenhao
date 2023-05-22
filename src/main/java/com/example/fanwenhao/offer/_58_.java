package com.example.fanwenhao.offer;

public class _58_ {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < chars.length; i++ ) {
            stringBuilder.append(chars[i]);
        }
        for (int i = 0; i < n; i++ ) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
