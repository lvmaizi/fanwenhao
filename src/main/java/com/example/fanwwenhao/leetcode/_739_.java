package com.example.fanwwenhao.leetcode;

import java.util.Stack;

/**
 * 每日温度
 */
public class _739_ {
    /**
     * 栈方法
     */
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=T.length-1;i>=0;i--){
            if(!stack.empty()){
                if(T[i]<T[stack.peek()]){
                }
            }
        }
        return result;
    }
    /**
     *
     */
}
