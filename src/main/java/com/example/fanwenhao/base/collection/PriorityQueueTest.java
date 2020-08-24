package com.example.fanwenhao.base.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Date 2020/6/23 16:20
 * @Version 1.0
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1==o2)return 0;
                return o1>o2?-1:1;
            }
        };
        PriorityQueue priorityQueue = new PriorityQueue(c);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(6);
        priorityQueue.add(0);
        priorityQueue.add(9);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
}
