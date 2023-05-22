package com.example.fanwenhao.leetcode;

public class _279_ {
    public int numSquares(int n) {
        int result[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = i;
            for (int j = 1; j <= i; j ++) {
                if (j * j > i) {
                    break;
                }
                min = Math.min(min, result[i - j * j] + 1);
            }
            result[i] = min;
        }
        return result[n];
    }
}
