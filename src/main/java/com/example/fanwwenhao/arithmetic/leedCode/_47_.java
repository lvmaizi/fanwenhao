package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @Date 2020/7/23 11:33
 * @Version 1.0
 */
public class _47_ {
    public List<List<Integer>> permuteUnique(int[] nums) {
        result = new ArrayList<>();
        user = new boolean[nums.length];
        recall(nums,new ArrayList<>());
        return result;
    }
    private boolean[] user;
    private List result;
    private void recall(int [] nums,List<Integer> rs){
        if(rs.size() == nums.length){
            //添加结果
            result.add(rs);
            return;
        }
        //排列其中一位
        for (int i=0;i<nums.length;i++){
            if(user[i] == true)continue;
            if(i>0 && nums[i] == nums[i-1] && user[i-1] == false)continue;
            user[i] = true;
            rs.add(nums[i]);
            recall(nums,new ArrayList<>(rs));
            user[i] = false;
            rs.remove(rs.size()-1);
        }
    }

}
