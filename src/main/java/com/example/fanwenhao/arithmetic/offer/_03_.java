package com.example.fanwenhao.arithmetic.offer;

public class _03_ {
    public int findRepeatNumber(int[] nums) {
        int[] a = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if(a[nums[i]]!=0){
                return a[nums[i]];
            }else a[i]=nums[i];
        }
        return 0;
    }
}
