package com.example.fanwwenhao.arithmetic.offer;

import java.util.Stack;

/**
 * @Date 2020/6/15 14:51
 * @Version 1.0
 */
public class _31_ {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();
        int i=0,j=0;
        while (true){
            if(j == pushed.length)break;
            if(!stack.empty() && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }else if(i < popped.length){
                stack.push(pushed[i]);
                i++;
            }else break;
        }
        if(j == popped.length)return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new _31_().validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,3,5,1,2}));
    }
}
