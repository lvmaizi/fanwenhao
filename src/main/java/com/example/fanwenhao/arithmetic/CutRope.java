package com.example.fanwenhao.arithmetic;

/**
 * @Date 2019/11/16 9:03
 * @Version 1.0
 * 剪绳子
 */
public class CutRope {
    //动态规划
    public static int cutRope(int target) {
        int dp[] = new int[target+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        if(target==2)return 1;
        if(target==3)return 2;
        for(int j=4;j<=target;j++){
            for (int i=1;i<=j/2;i++){
                dp[j]=Math.max(dp[j],dp[i]*dp[j-i]);
            }
            System.out.println(j+"="+dp[j]);
        }
        return dp[target];
    }

    public static void main(String[] args) {
        cutRope(4);
    }
}
