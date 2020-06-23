package com.example.fanwwenhao.arithmetic.offer;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Date 2020/6/22 17:02
 * @Version 1.0
 */
public class _40_ {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length==0 || k==0)return new int[0];
        int[] result = new int[k];
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(arr[0]);
        for (int i=1;i<arr.length;i++){
            int size =linkedList.size();
            for (int j=0;j<size;j++){
                if (linkedList.get(j)>arr[i]){
                    linkedList.add(j,arr[i]);
                    break;
                }
                if(j == linkedList.size()-1)linkedList.add(arr[i]);
            }
            if(linkedList.size()>k)linkedList.removeLast();
        }
        Integer[] integer = linkedList.toArray(new Integer[k]);
        for (int i=0;i<integer.length;i++){
            result[i] = integer[i];
        }
        return result;
    }
    int k = 0;
    public int[] getLeastNumbers1(int[] arr, int k) {
        if (arr.length==0 || k==0)return new int[0];
        this.k = k;
        quickSort(arr,0,arr.length-1);
        int[] result = Arrays.copyOf(arr,k);
        return result;
    }
    public void quickSort(int[] arr,int start,int end){
        if(start>=end)return;
        int i=start,j=end,tmp=arr[start];
        while (i<j){
            while (i<j && arr[j]>tmp)j--;
            arr[i] = arr[j];
            while (i<j && arr[i]<=tmp)i++;
            arr[j] = arr[i];
        }
        arr[i] = tmp;
        if(i+1>=k){
            quickSort(arr,start,i-1);
            return;
        }else {
            quickSort(arr,i+1,end);
        }
    }
    public static void main(String[] args) {
        new _40_().getLeastNumbers1(new int[]{3,2,1},2);
    }
}
