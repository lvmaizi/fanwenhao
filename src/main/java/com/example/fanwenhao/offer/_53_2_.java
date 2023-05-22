package com.example.fanwenhao.offer;

public class _53_2_ {
    public int missingNumber(int[] nums) {
        int result = search(nums, 0, nums.length - 1);
        return result;
    }

    private int search(int[] nums, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (mid == nums[mid]) {
            return search(nums, mid, right);
        } else if (mid < nums[mid]) {
            int r = search(nums, left, mid - 1);
            return r == -1 ? mid : r;
        } else {
            // 参数错误
        }
        return -1;
    }
}
