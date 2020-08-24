package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/23 10:20
 * @Version 1.0
 */
public class _64_ {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        //初始值
        dp[dp.length-1][dp[0].length-1] = grid[dp.length-1][dp[0].length-1];
        for (int i=grid[0].length-2;i>=0;i--){
            dp[dp.length-1][i] = grid[grid.length-1][i] + dp[dp.length-1][i+1];
        }
        for (int i=grid.length-2;i>=0;i--){
            for (int j=grid[0].length-1;j>=0;j--){
                if(j == grid[0].length-1){
                    dp[i][j] = dp[i+1][j] + grid[i][j];
                }else {
                    dp[i][j] = grid[i][j] + (dp[i+1][j]<dp[i][j+1]?dp[i+1][j]:dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int i = 4 + (2<3?2:3);
        System.out.println(i);
        new _64_().minPathSum(new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        });
    }
}
