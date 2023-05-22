package com.example.fanwenhao.offer;

import java.util.HashMap;

public class _57_ {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0;i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{nums[i], target - nums[i]};
            }
        }
        return new int[0];
    }
}
