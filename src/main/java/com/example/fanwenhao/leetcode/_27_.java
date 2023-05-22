package com.example.fanwenhao.leetcode;

public class _27_ {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            } else {
                nums[++index] = nums[i];
            }
        }
        return index+1;
    }
}
