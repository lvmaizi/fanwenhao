package com.example.fanwenhao.arithmetic;

/**
 * @Date 2019/11/16 15:39
 * @Version 1.0
 */
public class DpCommon {
    //数组中最长公共前缀
    public static String longestCommonPrefix(String[] strs){
        for (int i=0;i<strs[0].length();i++){
            for (int j=0;j<strs.length;j++){
                if(strs[j].length()<=i||strs[0].charAt(i)!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
    //最大序列和
    public static int maxSubArray(int[] nums){
        int[] result = new int[nums.length+1];
        int maxResult = nums[0];
        for (int i=1;i<=nums.length;i++){
            result[i] = result[i-1]>0?result[i-1]+nums[i-1]:nums[i-1];
            maxResult = Math.max(maxResult,result[i]);
        }
        return maxResult;
    }
}
