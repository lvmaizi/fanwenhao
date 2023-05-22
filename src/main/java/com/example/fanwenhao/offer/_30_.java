package com.example.fanwenhao.offer;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Stack;

public class _30_ {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || minStack.peek() >= x) {
            minStack.push(x);
            return;
        }
    }

    public void pop() {
        Integer x = stack.pop();
        if (!minStack.empty() && minStack.peek().equals(x)) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }

}
