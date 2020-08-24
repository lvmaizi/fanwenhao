package com.example.fanwenhao.arithmetic;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author fanwenhao
 * @Date 2019/10/24 14:49
 * @Version 1.0
 */
public class TriangleMaxPath {
    static int[][] triangle = {
            {7},
            {3,8},
            {8,1,0},
            {2,7,4,4},
            {4,5,2,6,5}
    };

    /**
     * 递归
     * @return
     */
    public int calculateMaxPath (int[][] doubleArray,int row,int cell) {
        if(row>=doubleArray.length){
            return doubleArray[row][cell];
        }else {
            return Math.max(doubleArray[row][cell]+calculateMaxPath(doubleArray,row+1,cell),
                    doubleArray[row][cell]+calculateMaxPath(doubleArray,row+1,cell+1));
        }
    }

    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        ConcurrentHashMap concurrentHashMap;
        HashMap hashMap;
        ca.setTime(new Date());
        ca.set(Calendar.HOUR, 23);
        ca.set(Calendar.MINUTE, 59);
        ca.set(Calendar.SECOND, 59);
        System.out.println(String.valueOf(ca.getTimeInMillis()));
        System.out.println(String.valueOf(Long.MAX_VALUE - ca.getTimeInMillis()));
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        System.out.println(list.stream().sorted((x, y) -> (y-x)).findFirst());
    }
}
