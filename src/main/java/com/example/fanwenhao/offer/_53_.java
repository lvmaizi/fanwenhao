package com.example.fanwenhao.offer;

public class _53_ {
    public int search(int[] nums, int target) {
        int left = searchLeft(nums, 0, nums.length -1, target);
        int right = searchLeft(nums, 0, nums.length -1, target);
        if (left != -1) {
            return right - left + 1;
        }
        return 0;
    }

    private int searchLeft(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (nums[mid] < target) {
            return searchLeft(nums, mid + 1, right, target);
        } else if (nums[mid] > target) {
            return searchLeft(nums, left, mid - 1, target);
        } else {
            int i = searchLeft(nums, left, mid - 1, target);
            if (i != -1) {
                return i;
            } else {
                return mid;
            }
        }
    }

    private int searchRight(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (nums[mid] < target) {
            return searchRight(nums, mid + 1, right, target);
        } else if (nums[mid] > target) {
            return searchRight(nums, left, mid - 1, target);
        } else {
            int i = searchRight(nums, mid + 1, right, target);
            if (i != -1) {
                return i;
            } else {
                return mid;
            }
        }
    }
}
