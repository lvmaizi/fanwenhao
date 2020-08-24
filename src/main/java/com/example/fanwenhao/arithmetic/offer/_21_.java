package com.example.fanwenhao.arithmetic.offer;

/**
 * @Date 2020/7/1 14:43
 * @Version 1.0
 */
public class _21_ {
    public int[] exchange(int[] nums) {
        int start=0,end=nums.length-1;
        while (start<=end){
            while (start<=end){
                if(nums[start]%2!=0)start++;
                else break;
            }
            while (start<=end){
                if(nums[end]%2==0)end--;
                else break;
            }
            if(start<end){
                int tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
            }
        }
        return nums;
    }
}
