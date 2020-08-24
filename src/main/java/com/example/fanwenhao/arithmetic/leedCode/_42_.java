package com.example.fanwenhao.arithmetic.leedCode;

import java.util.Stack;

public class _42_ {
    //暴力解决
    public int trap(int[] height) {
        int rs = 0;
        for (int i = 0; i < height.length; i++){
            int left = 0,right = 0;
            //左边最大
            for (int l = 0; l < i; l++){
                left = Math.max(left,height[l]);
            }
            //右边最大
            for (int r = i+1; r < height.length; r++){
                right = Math.max(right,height[r]);
            }
            if(Math.min(left,right) > height[i]){
                rs = rs + Math.min(left,right) - height[i];
            }
        }
        return rs;
    }
    //动态规划
    public int trap1(int[] height) {
        int rs = 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int max = 0;
        for (int i = 1;i < height.length; i++){
            if(height[i-1] > max){
                max = height[i-1];
                maxLeft[i] = max;
            }else {
                maxLeft[i] = max;
            }
        }
        max = 0;
        for (int i = height.length - 2;i >= 0; i--){
            if(height[i+1] > max){
                max = height[i+1];
                maxRight[i] = max;
            }else {
                maxRight[i] = max;
            }
        }
        for (int i = 0; i < height.length; i++){
            if(Math.min(maxLeft[i],maxRight[i]) > height[i]){
                rs = rs + Math.min(maxLeft[i],maxRight[i]) - height[i];
            }
        }
        return rs;
    }
    //栈解决
    public int trap2(int[] height) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        while (current < height.length) {
            //如果栈不空并且当前指向的高度大于栈顶高度就一直循环
            while (!stack.empty() && height[current] > height[stack.peek()]) {
                int h = height[stack.peek()]; //取出要出栈的元素
                stack.pop(); //出栈
                if (stack.empty()) { // 栈空就出去
                    break;
                }
                int distance = current - stack.peek() - 1; //两堵墙之前的距离。
                int min = Math.min(height[stack.peek()], height[current]);
                sum = sum + distance * (min - h);
            }
            stack.push(current); //当前指向的墙入栈
            current++; //指针后移
        }
        return sum;

    }
    //双指针
    public int trap3(int[] height) {
        if(height.length == 0)return 0;
        int max_left = height[0],max_right = height[height.length-1],rs = 0;
        int i = 1,j = height.length-2;
        while (i <= j){
            if(max_left < max_right){
                if(height[i] > max_left){
                    max_left = height[i];
                }else {
                    rs = rs + max_left - height[i];
                }
                i++;
            }else {
                if(height[j] > max_right){
                    max_right = height[j];
                }else {
                    rs = rs + max_right - height[j];
                }
                j--;
            }
        }
        return rs;
    }
    public static void main(String[] args) {
        System.out.println(new _42_().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(new _42_().trap1(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(new _42_().trap2(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(new _42_().trap3(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));

    }
}
