package com.example.fanwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Date 2020/5/20 14:05
 * @Version 1.0
 */
public class _15_ {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if(nums[i]>0)break;
            if(i>0 && nums[i] == nums[i-1])continue;
            int L = i+1;
            int R = nums.length-1;
            while (L<R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    lists.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1])L++;
                    while (L<R && nums[R] == nums[R-1])R--;
                    L++;
                    R--;
                }else if(sum <0)L++;
                else R--;
            }
        }
        return lists;
    }
}
