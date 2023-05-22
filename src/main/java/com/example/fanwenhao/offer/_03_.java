package com.example.fanwenhao.offer;

public class _03_ {
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int t = nums[i];
            if (t == i) {
                i ++;
            } else {
                if (nums[t] == t) {
                    return t;
                }
                else {
                    int tmp = nums[t];
                    nums[t] = t;
                    nums[i] = tmp;
                }
            }
        }
        return -1;
    }
}
