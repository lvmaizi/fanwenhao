package com.example.fanwenhao.leetcode;

public class _62_ {
    public int uniquePaths(int m, int n) {
        int right = 0;
        int down = 0;
        int[][] result = new int[m][n];
        for (int i = m-1; i >= 0; m --) {
            for (int j = n-1; n >= 0; n --) {
                if (j == n-1 && i == m-1) {
                    result[i][j] = 1;
                    continue;
                }
                if (j == n-1) {
                    right = 0;
                } else {
                    right = result[i][j + 1];
                }
                if (i == m-1) {
                    down = 0;
                }else {
                    down = result[i + 1][j];
                }
                result[i][j] = right + down;
            }
        }
        return result[0][0];
    }
}
