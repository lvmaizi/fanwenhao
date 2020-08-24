package com.example.fanwenhao.common;

import java.util.Queue;

/**
 * @Date 2019/12/17 18:40
 * @Version 1.0
 */
public class ProductConsume {
    public Queue<Integer> queue;
    public void product() {
        synchronized (queue){
            while (queue.size() == 10){
                //队列已满挂起线程
                try {
                    queue.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            queue.add(1);
            queue.notifyAll();
        }
    }
    public void consume() {
        synchronized (queue){
            while (queue.size() == 0){
                //队列已满挂起线程
                try {
                    queue.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            queue.remove();
            queue.notifyAll();
        }
    }

    public static void main(String[] args) {
        Object object;
    }
}
