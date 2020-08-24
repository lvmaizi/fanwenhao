package com.example.fanwenhao.arithmetic.offer;

/**
 * @Date 2020/6/22 16:52
 * @Version 1.0
 */
public class _39_ {
    public int majorityElement(int[] nums) {
        if(nums.length==0)return 0;
        int r = nums[0],sum=1;
        for (int i=1;i<nums.length;i++){
            if(nums[i] != r){
                if(sum>0)sum--;
                else r = nums[i];
            }else sum++;
        }
        return r;
    }
}
