package com.example.fanwwenhao.arithmetic.offer;

public class _53_1_ {
    public int search(int[] nums, int target) {
        //二分查找是否存在若存在则记录下标
        int start=0,end =nums.length-1;
        int mid=0,i =-1,result=0;
        while (start<=end){
            mid = (start+end)/2;
            if(nums[mid]<target)start=mid+1;
            if(nums[mid]>target)end=mid-1;
            if(nums[mid]==target){
                i=mid;
                break;
            }
        }
        //根据下表左右查找统计次数
        if (i!=-1){
            //上前寻找
            result++;
            int a = i-1;
            while (a>=0){
                if(nums[a--]==target)result++;
                else break;
            }
            a = i+1;
            while (a<nums.length){
                if(nums[a++]==target)result++;
                else break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new _53_1_().search(new int[]{5,7,7,8,8,10},6));
    }
}
