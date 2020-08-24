package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/6/19 11:33
 * @Version 1.0
 */
public class _53_ {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)return 0;
        int result =nums[0] ,max=nums[0];
        for (int i=1;i<nums.length;i++){
            //max表示以当前节点结束的连续数组的最大和（i的上一个）
            if(max>0){
                max = max+nums[i];
            }else max = nums[i];
            result = Math.max(result,max);

        }
        return result;
    }
}
