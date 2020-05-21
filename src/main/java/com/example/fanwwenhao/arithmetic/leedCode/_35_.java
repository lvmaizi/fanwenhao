package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/5/21 11:19
 * @Version 1.0
 */
public class _35_ {
    public int searchInsert(int[] nums, int target) {
        int L=0,R=nums.length-1,mid=0;
        while(L<=R){
            mid = (L+R)/2;
            if(nums[mid] == target)return mid;
            if(nums[mid] < target) {L = mid+1;}
            if(nums[mid] > target) {R = mid-1;}
        }
        //没找到
        return L;
    }

    public static void main(String[] args) {
        new _35_().searchInsert(new int[]{1,3,5,6},0);
    }
}
