package com.example.fanwenhao.leetcode;

public class _42_ {
    public int trap(int[] height) {
        // 左边最高的柱子
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        int max = 0;
        for (int i = 1; i < height.length; i++) {
            max = Math.max(height[i - 1], max);
            leftMax[i] = max;
        }
        max = 0;
        for (int i = height.length - 2; i >= 0; i++) {
            max = Math.max(height[i + 1], max);
            rightMax[i] = max;
        }
        int result = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int item = Math.min(leftMax[i], rightMax[i]);
            if (height[i] < item) {
                result = result + item -  height[i];
            }
            System.out.println("i :" + i  + " result :" + result + " leftMax[i] :" + leftMax[i] + " rightMax[i] :" + rightMax[i]);

        }
        return result;
    }
}
