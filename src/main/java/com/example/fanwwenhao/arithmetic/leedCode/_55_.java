package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/6/19 14:10
 * @Version 1.0
 */
public class _55_ {
    public boolean canJump(int[] nums) {
        if(nums.length<=0)return false;
        boolean[] dp = new boolean[nums.length];
        dp[dp.length-1] = true;
        for (int i=nums.length-2;i>=0;i--){
            if(nums[i]+i<nums.length){
                //这个阶段有没有可以跳到终点的
                for(int j=i+1;j<=nums[i]+i;j++){
                    if(dp[j] == true){
                        dp[i] = true;
                        break;
                    }
                }
            }else {
                dp[i] = true;
            }
        }
        return dp[0];
    }
}
