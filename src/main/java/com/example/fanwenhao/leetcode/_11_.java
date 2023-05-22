package com.example.fanwenhao.leetcode;

public class _11_ {
    public int maxArea(int[] height) {
        if (height.length == 0) {
            return 0;

        }
        int maxArea = 0;
        int front = 0;
        int back = height.length - 1;

        while (front < back) {
            maxArea = Math.max(maxArea, (back - front) * Math.min(height[front], height[back]));
            if (height[front] <= height[back]) {
                front ++;
            } else {
                back --;
            }
        }
        return maxArea;
    }
}
