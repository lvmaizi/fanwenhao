package com.example.fanwenhao.offer;

import java.util.Stack;

public class _9_ {



    Stack<Integer> stackAppend = new Stack<>();
    Stack<Integer> stackDelete = new Stack<>();

    public void appendTail(int value) {
        stackAppend.push(value);
    }

    public int deleteHead() {
        if (stackDelete.isEmpty()) {
            while (!stackAppend.isEmpty()) {
                stackDelete.push(stackAppend.pop());
            }
        }
        if (stackDelete.isEmpty()) {
            return 0;
        }
        return stackDelete.pop();
    }
}
