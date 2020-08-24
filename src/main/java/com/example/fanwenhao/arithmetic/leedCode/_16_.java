package com.example.fanwenhao.arithmetic.leedCode;

import java.util.Arrays;

public class _16_ {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int rs = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++){
            int start = i+1,end = nums.length-1;
            while (start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(Math.abs(target - sum) < Math.abs(target - rs)){
                    rs = sum;
                }
                if(sum < target){
                    start ++;
                }else if(sum > target)
                    end --;
                else return rs;
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        new _16_().threeSumClosest(new int[]{1,1,1,0},-100);
    }
}
