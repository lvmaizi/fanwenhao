package com.example.fanwenhao.offer;

public class _10_2_ {
    public int numWays(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1, b= 2,t;
        for (int i = 3; i <= n; i ++) {
            t = b;
            b = (a + b) % 1000000007;
            a = t;
        }
        return b;
    }
}
