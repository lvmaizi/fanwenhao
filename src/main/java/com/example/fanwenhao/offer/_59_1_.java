package com.example.fanwenhao.offer;

import java.util.Arrays;

public class _59_1_ {

    int[][] maxArray;
    boolean[][] isStore;
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k];
        maxArray = new int[nums.length][nums.length];
        isStore = new boolean[nums.length][nums.length];
        for (int i = 0; i < nums.length - k; i ++) {
            result[i] = dfs(nums, i, i + k);
        }
        return result;
    }

    private int dfs(int[] nums, int start, int end) {
        if (start > end) return 0;
        if (isStore[start][end]) {
            return maxArray[start][end];
        }
        int max = nums[start] + dfs(nums, start + 1, end);
        isStore[start][end] = true;
        maxArray[start][end] = max;
        return max;
    }
}
