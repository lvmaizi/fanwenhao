package com.example.fanwenhao.offer;

public class _42_ {
    public int maxSubArray(int[] nums) {
        if (nums.length ==0) return 0;
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i --) {
            if (sum > 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
