package com.example.fanwenhao.leetcode;

public class _343_ {
    public int integerBreak(int n) {
        int[] tmp = new int[n];
        tmp[0] = 1;
        for (int i = 2; i <= n; i ++) {
            int max = 0;
            for (int j = 1; j < i; j ++) {
                max = Math.max(max, Math.max(j * (i - j), j * tmp[i - j - 1]));
//                System.out.println("+===+" + max);
            }
            tmp[i - 1] = max;
//            System.out.println(max);
        }
        return tmp[n - 1];
    }
}
