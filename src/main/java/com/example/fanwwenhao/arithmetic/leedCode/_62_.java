package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.Arrays;

/**
 * @Date 2020/7/23 15:00
 * @Version 1.0
 */
public class _62_ {
    public int uniquePaths(int m, int n) {
        //初始值
        int[][] dp = new int[n][m];
        dp[n-1][m-1] = 1;
        Arrays.fill(dp[n-1],1);
        for (int i = n-2;i >= 0;i--){
            for (int j = m-1;j >= 0;j--){
                if(j == m-1){
                    dp[i][j] = dp[i+1][j];
                }else {
                    dp[i][j] = dp[i+1][j] + dp[i][j+1];
                }
            }
        }
        return dp[0][0];
    }
    public int uniquePaths1(int m, int n) {
        //初始值
        int[][] dp = new int[n][m];
        dp[n-1][m-1] = 1;
        Arrays.fill(dp[n-1],1);
        for (int i = n-2;i >= 0;i--){
            for (int j = m-1;j >= 0;j--){
                if(j == m-1){
                    dp[i][j] = dp[i+1][j];
                }else {
                    dp[i][j] = dp[i+1][j] + dp[i][j+1];
                }
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
        new _62_().uniquePaths(3,2);
    }
}
