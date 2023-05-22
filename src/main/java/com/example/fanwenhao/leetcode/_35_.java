package com.example.fanwenhao.leetcode;

public class _35_ {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        return searchInsert(nums, 0, nums.length - 1, target);
    }

    private int searchInsert(int[] nums, int start, int end, int target) {
        if (start == end) {
            if (nums[start] >= target) {
                return start;
            } else {
                return start + 1;
            }
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] < target) {
            return searchInsert(nums, mid, end, target);
        } else {
            return searchInsert(nums, start, mid, target);
        }
    }
}
