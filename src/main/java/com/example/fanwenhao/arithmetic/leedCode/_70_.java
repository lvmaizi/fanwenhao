package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/5/21 14:53
 * @Version 1.0
 */
public class _70_ {
    //非递归
    public int climbStairs(int n) {
        if(n<=1)return 1;
        int[] results = new int[n];
        results[0]=1;
        results[1]=2;
        for (int i=2;i<n;i++){
            results[i] = results[i-1] + results[i-2];
        }
        return results[n-1];
    }
}
