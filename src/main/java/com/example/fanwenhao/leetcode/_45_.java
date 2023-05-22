package com.example.fanwenhao.leetcode;

public class _45_ {

    public static void main(String[] args) {
        _45_ test = new _45_();
        System.out.println(test.jump(new int[]{1, 2, 3}));
    }

    public int jump(int[] nums) {
        int result = 0;
        int start = 0;
        while (start < nums.length - 1) {
            start = find(start, nums);
            result ++;
        }
        return result;
    }

    private int find(int start, int[] nums) {
        int j = nums[start];
        if (j == 0) {
            return  - 1;
        }
        if (j + start >= nums.length - 1) {
            return nums.length - 1;
        }
        int max = 0;
        int index = start;
        for (int i = start + 1; i <= start + j; i ++) {
            if (i + nums[i] > max) {
                index = i;
                max = i + nums[i];
            }
        }
        return index;
    }
}
