package com.example.fanwenhao.arithmetic.huawei;

public class _5_8 {
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,7,1,5,9,3,2,1};
        int[] dp = new int[input.length];
        for (int i=dp.length-2;i>=0;i--){
            if(i+input[i]>=input.length){
                dp[i]  = 0;
            }else if(i+input[i] == input.length-1){
                dp[i] = 1;
            }else {
                if(dp[i+input[i]] == 0){
                    dp[i] = 0;
                }else {
                    dp[i] = 1 + dp[i+input[i]];
                }
            }
        }
        int result = Integer.MAX_VALUE;
        for (int i=1;i<dp.length/2+1;i++){
            if(dp[i]>0 && result>dp[i])result=dp[i];
        }
        if(result == Integer.MAX_VALUE) System.out.println(-1);
        System.out.println(result+1);
    }
}
