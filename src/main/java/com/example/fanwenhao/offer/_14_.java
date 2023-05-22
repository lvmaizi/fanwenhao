package com.example.fanwenhao.offer;

public class _14_
{
    public int cuttingRope(int n) {
        int[] result = new int[n + 1];
        for (int i = 2; i <= n; i ++) {
            if (i == 2) {
                result[i] = 1;
            }
            for (int j = 1; j  < i - 1; j ++) {
                int max = Math.max(j * (i - j), j * result[i - j]);
                result[i] = Math.max(result[i], max);
            }
        }
        return result[n];
    }
}
