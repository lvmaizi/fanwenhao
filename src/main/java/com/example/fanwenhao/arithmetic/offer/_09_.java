package com.example.fanwenhao.arithmetic.offer;

import java.util.Stack;

public class _09_ {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.empty() && !stack1.empty()){
            //赋值
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.empty()){
            return -1;
        }else {
            return (int) stack2.pop();
        }
    }
}
