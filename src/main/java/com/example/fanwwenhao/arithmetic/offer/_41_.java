package com.example.fanwwenhao.arithmetic.offer;

import com.example.fanwwenhao.base.dynamicProxy.P;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Date 2020/6/23 15:30
 * @Version 1.0
 */
public class _41_ {
    List<Integer> list = new ArrayList();

    _41_(){

    }
    public void addNum(int num) {
        if(list.size()==0 || list.get(0)>=num) {
            list.add(0,num);
            return;
        }
        int size = list.size();
        for (int i=1;i<size;i++){
            if(list.get(i)>=num){
                list.add(i,num);
                break;
            }
        }
        if(size==list.size())list.add(num);
    }

    //二分查找插入
    public void addNum1(int num) {
        if (list.size()==0 || list.get(list.size()-1)<=num){
            list.add(num);
            return;
        }
        int i=0,j=list.size()-1;
        int mid ;
        //查找插入在谁的前面
        while (i<=j){
            mid = (i+j)/2;
            //相等直接插入
            if (list.get(mid)==num){
                list.add(mid,num);
                break;
            }
            //只能插入
            if(i==j){
                list.add(i,num);
                break;
            }
            if(list.get(mid)>num)j=mid;
            if(list.get(mid)<num)i=mid+1;

        }
        //if(j == list.size()-1)list.add(num);
    }

    //优先队列
    PriorityQueue<Integer> min = new PriorityQueue();
    PriorityQueue<Integer> max = new PriorityQueue(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1==o2)return 0;
            return o1>o2?-1:1;
        }
    });
    public void addNum2(int num) {
        max.add(num);
        min.add(max.poll());
        if(min.size()>max.size()){
            max.add(min.poll());
        }

    }
    public double findMedian2() {
        if(max.size()==min.size())return (min.peek()+max.peek())*0.5;
        return max.peek();
    }
    public double findMedian() {
        if (list.size()==0)return 0.0;
        if(list.size()%2==0){
            return ((double)list.get(list.size()/2) + (double)list.get(list.size()/2-1))/2.0;
        }else {
            return list.get(list.size()/2);
        }
    }

    public static void main(String[] args) {
        _41_ a = new _41_();
        a.addNum2(-1);
        a.addNum2(-2);
        a.addNum2(-3);
        a.addNum2(-4);
        a.addNum2(-5);

        System.out.println(a.findMedian2());

    }
}
