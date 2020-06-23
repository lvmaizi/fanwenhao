package com.example.fanwwenhao.arithmetic;

import java.util.Arrays;

/**
 * @Date 2020/6/23 14:08
 * @Version 1.0
 */
public class FastSort {
    public void quickSort(int[] a,int start,int end){
        if(start >= end)return;
        int index = partition(a,start,end);
        quickSort(a,start,index-1);
        quickSort(a,index+1,end);
    }
    public int partition(int[] a,int start,int end){
        int tmp = a[start];
        while (start<end){
            //从右向左找到一个值填坑
            while (start<end && a[end] >tmp){
                end--;
            }
            swap(a,start,end);
            //从左向右找到一个值填坑
            while (start < end && a[start]<=tmp){
                start++;
            }
            swap(a,start,end);
        }
        return start;
    }
    private void swap(int[] a,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        int[] a ={1,2,6,0,4,3,5};
        new FastSort().quickSort(a,0,6);
        System.out.println("s");
    }
}
