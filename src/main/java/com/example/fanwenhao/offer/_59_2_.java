package com.example.fanwenhao.offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _59_2_ {
    Queue<Integer> queue = new LinkedList<>();
    LinkedList<Integer> maxQueue = new LinkedList<>();

    public int max_value() {
        if (maxQueue.isEmpty()) {
            return -1;
        }
        return maxQueue.getLast();
    }

    public void push_back(int value) {
        queue.add(value);
        System.out.println(maxQueue);
        if (maxQueue.isEmpty() || maxQueue.getLast().compareTo(value) <= 0) {
            maxQueue.addLast(value);
        }
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        Integer value = queue.poll();
        System.out.println(maxQueue);
        if (value.equals(maxQueue.getFirst())) {
            maxQueue.removeFirst();
        }
        return value;
    }
}
