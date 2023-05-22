package com.example.fanwenhao.leetcode;

public class _198_ {
    public int rob(int[] nums) {
        int result[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i --) {
            if (i == nums.length - 1) {
                result[i] = nums[i];
                continue;
            }
            if (i == nums.length - 2) {
                result[i] = Math.max(nums[i], nums[i + 1]);
                continue;
            }
            result[i] = Math.max(nums[i] + result[i + 2], result[i + 1]);
        }
        return result[0];
    }
}
