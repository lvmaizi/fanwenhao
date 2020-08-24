package com.example.fanwenhao.arithmetic.huawei;

import java.util.Stack;

/**
 * @Date 2020/7/22 17:25
 * @Version 1.0
 */
public class _1_11 {
    public static void main(String[] args) {
        int[] input = new int[]{5,10,20,50,85,1};
        Stack<Integer> stack = new Stack();
        Stack<Integer> helpStack = new Stack();
        stack.push(input[0]);
        for (int i=1;i<input.length;i++){
            int sum = 0;
            while (!stack.isEmpty()){
                int p = stack.pop();
                helpStack.push(p);
                sum = sum +p;
                if(sum == input[i]){
                    stack.push(2*sum);
                    while (!helpStack.isEmpty())helpStack.pop();
                    break;
                }
                if(sum > input[i]){
                    while (!helpStack.isEmpty())stack.push(helpStack.pop());
                    stack.push(input[i]);
                    break;
                }
                if(stack.isEmpty()){
                    while (!helpStack.isEmpty())stack.push(helpStack.pop());
                    stack.push(input[i]);
                    break;
                }
            }
        }
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
