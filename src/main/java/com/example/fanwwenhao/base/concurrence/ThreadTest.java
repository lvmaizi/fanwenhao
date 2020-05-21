package com.example.fanwwenhao.base.concurrence;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.concurrent.*;

/**
 * @Date 2020/5/15 14:04
 * @Version 1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        Queue queue;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        BlockingQueue blockingQueue;
        SynchronousQueue synchronousQueue;
        ArrayBlockingQueue arrayBlockingQueue;
        PriorityBlockingQueue priorityBlockingQueue;
        LinkedBlockingQueue linkedBlockingQueue;
        HashMap hashMap = new HashMap();
        hashMap.put("u",null);
        hashMap.put(null,"null");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("o",null);
        concurrentHashMap.put(null,"2");
        concurrentHashMap.get("");
        TreeMap treeMap = new TreeMap();
        treeMap.put("2",null);
        treeMap.put(null,"s");
        Map map;
        System.out.println("");
    }
}
