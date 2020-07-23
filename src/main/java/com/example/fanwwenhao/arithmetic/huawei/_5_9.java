package com.example.fanwwenhao.arithmetic.huawei;

public class _5_9 {
    public static void main(String[] args) {
        int[][] input = new int[][]{
                {30,8,4},
                {50,20,9},
                {11,7,6}
        };
        int[] dp = input[input.length-1];
        int[] newdp = new int[input[0].length];
        for (int i= input.length-2;i>=0;i--){
            newdp[0] = input[i][0] + Math.max(dp[1],dp[2]);
            newdp[1] = input[i][1] + Math.max(dp[0],dp[2]);
            newdp[2] = input[i][2] + Math.max(dp[0],dp[1]);
            int[] tmp = dp;
            dp = newdp;
            newdp = tmp;
        }
        System.out.println(Math.max(Math.max(dp[0],dp[1]),dp[2]));
    }
}
