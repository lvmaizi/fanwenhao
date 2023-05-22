package com.example.fanwenhao.leetcode;

public class _33_ {

    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[0]) {
                // 左边有序 [left mid]
                if (target > nums[mid]) {
                    left = mid + 1;
                } else if (target < nums[0]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            } else {
                // 右边有序[mid,right]
                if (target < nums[mid]) {
                    right = mid;
                } else if (target > nums[len - 1]) {
                    right = mid;
                } else  {
                    left = mid + 1;
                }
            }

        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
}
