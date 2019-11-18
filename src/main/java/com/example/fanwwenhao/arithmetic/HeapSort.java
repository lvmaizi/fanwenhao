package com.example.fanwwenhao.arithmetic;

public class HeapSort {
    public static int[] array = {3,6,9,1,2,4,0,5,8,7};
    //堆排序
    public static void heapSort(int[] array){
        for (int i=array.length-1;i>=0;i--) {
            buildMaxHeap(array,i+1);
            //最大堆元素与最后一个元素交换
            int tmp = array[i];
            array[i] = array[0];
            array[0] = tmp;
        }
    }
    //建最大堆
    public static void buildMaxHeap(int[] array,int length){
        for (int i=length-1;i>=0;i--) {
            heapify(array,i,length);
        }
    }
    //若左右子树均为最大堆则调整此树为最大堆
    public static void heapify(int [] array,int current,int size){
        while(true){
            //左子树交换
            if(current*2+1<size && array[current]<array[current*2+1] ) {
                int tmp = array[current];
                array[current] = array[current*2+1];
                array[current*2+1] = tmp;
                //当前元素位置
                current = current*2+1;
                continue;
            }
            //右子树交换
            if(current*2+2<size && array[current]<array[current*2+2]) {
                int tmp = array[current];
                array[current] = array[current*2+2];
                array[current*2+2] = tmp;
                //当前元素位置
                current = current*2+2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        heapSort(array);
        System.out.println(array);
    }
}
