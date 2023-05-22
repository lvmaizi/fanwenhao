package com.example.fanwenhao.leetcode;

import java.util.Objects;

public class _4_ {
    public String longestPalindrome(String s) {
        if (Objects.isNull(s)) {
            return null;
        }
        if (s.length() == 0) {
            return "";
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            // 奇数
            String longest1 = getLongest(s, i, i);
            if (longest1.length() > result.length()) {
                result = longest1;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            // 偶数
            if (s.charAt(i) ==  s.charAt(i + 1)) {
                String longest2 = getLongest(s, i, i + 1);
                if (longest2.length() > result.length()) {
                    result = longest2;
                }
            }
        }

        return result;
    }

    private String getLongest(String s, int first, int last) {
        while (true) {
            if (s.charAt(last) != s.charAt(last)) {
                break;
            }
            if (first <= 0) {
                break;
            }
            if (last >= s.length() -1) {
                break;
            }
            if (s.charAt(first -1) == s.charAt(last + 1)) {
                first--;
                last ++;
            } else {
                break;
            }
        }
        return s.substring(first, last + 1);
    }

    public static void main(String[] args) {
        _4_ test = new _4_();
        System.out.println(test.longestPalindrome("ccabad"));
    }
}

