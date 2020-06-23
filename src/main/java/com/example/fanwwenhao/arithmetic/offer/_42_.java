package com.example.fanwwenhao.arithmetic.offer;

/**
 * @Date 2020/6/23 17:34
 * @Version 1.0
 */
public class _42_ {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)return 0;
        int result = nums[0];
        int sum = nums[0];
        for (int i=1;i<nums.length;i++){
            if(sum>0){
                sum += nums[i];
            }else sum = nums[i];
            result = Math.max(result,sum);
        }
        return result;
    }
}
