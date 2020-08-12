package com.example.fanwwenhao.arithmetic.leedCode;

public class _45_ {
    public int jump(int[] nums) {
        if(nums.length == 0)return 0;
        int[] dp = new int[nums.length];
        for (int i = nums.length-2; i >= 0; i--){
            int min = dp[i+1];
            for (int j = i+1; j < dp.length && j <= nums[i] + i; j++){
                min = Math.min(min,dp[j]);
            }
            dp[i] = min + 1;
        }
        return dp[0];
    }

    //贪心算法
    public int jump1(int[] nums) {
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for(int i = 0; i < nums.length - 1; i++){
            //找能跳的最远的
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if( i == end){ //遇到边界，就更新边界，并且步数加一
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
    public static void main(String[] args) {
        System.out.println(new _45_().jump1(new int[]{2, 3, 1, 1, 4}));
    }
}
