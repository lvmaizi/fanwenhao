package com.example.fanwenhao.arithmetic.leedCode;

import java.util.Arrays;

public class _31_ {
    public void nextPermutation(int[] nums) {
        //1 0 3 2
        //1 2 3
        //1 3 2 2 3 1
        //2 1 3
        //2 3 1
        //3 1 2
        //3 2 1
        if(nums.length<2)return;
        //从后向前找到第一个当前数字比前一位大的
        int index = 0;
        for (int i = nums.length-1; i > 0;i --){
            if(nums[i] > nums[i-1]){
                index = i;
                break;
            }
        }
        if(index == 0) Arrays.sort(nums);
        else {
            //从当前位置找，找到比上一个位置大且最接近
            for (int i = nums.length-1;i >= index;i --){
                if(nums[i] > nums[index-1]){
                    int tmp = nums[index-1];
                    nums[index-1] = nums[i];
                    nums[i] = tmp;
                    Arrays.sort(nums,index,nums.length);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        new _31_().nextPermutation(new int[]{1,3,2});
    }
}
