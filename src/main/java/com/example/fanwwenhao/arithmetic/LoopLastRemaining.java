package com.example.fanwwenhao.arithmetic;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author fanwenhao
 * @Date 2019/11/14 14:48
 * @Version 1.0
 * 约瑟夫环
 */
public class LoopLastRemaining {
    //循环链表
    public static int LastRemaining_Solution(int n, int m) {
        List<Integer> list = new LinkedList();
        for(int i=0;i<n;i++) {
            list.add(i);
        }
        int j=0;
        for(int i=1;i<n;i++){
            j = (m+j-1)%(list.size());
            System.out.println("第"+i+"次移除元素位置为"+list.get(j));
            list.remove(j);
        }
        return list.get(0);
    }
    //测试函数
    public static void main(String[] args) {
        LastRemaining_Solution(5,2);
    }
}
