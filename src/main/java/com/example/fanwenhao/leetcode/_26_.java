package com.example.fanwenhao.leetcode;

public class _26_ {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[index]) {
                continue;
            } else {
                nums[++index] = nums[i];
            }
        }
        return ++index;
    }
}
