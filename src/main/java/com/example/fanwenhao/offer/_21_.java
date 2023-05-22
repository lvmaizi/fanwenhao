package com.example.fanwenhao.offer;

public class _21_ {
    public int[] exchange(int[] nums) {
        int a = 0, b = nums.length -1;
        while (a <= b) {
            if (nums[a] % 2 != 0) {
                a ++;
                continue;
            }
            if (nums[b] % 2 == 0) {
                b--;
                continue;
            }
            int tmp = nums[a];
            nums[a] = nums[b];
            nums[b] = tmp;
        }
        return nums;
    }
}
