package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/23 15:15
 * @Version 1.0
 */
public class _63_ {
    public int uniquePaths(int[][] obstacleGrid) {
        int n = obstacleGrid.length,m = obstacleGrid[0].length;
        //初始值
        int[][] dp = new int[n][m];
        dp[n-1][m-1] = obstacleGrid[n-1][m-1] == 0?1:0;
        for (int i=m-2; i>= 0; i--){
            if(obstacleGrid[n-1][i] != 1)
                dp[n-1][i] = dp[n-1][i+1];
        }
        for (int i = n-2;i >= 0;i--){
            for (int j = m-1;j >= 0;j--){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                    continue;
                }
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
        new _63_().uniquePaths(new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0}
        });
    }
}
