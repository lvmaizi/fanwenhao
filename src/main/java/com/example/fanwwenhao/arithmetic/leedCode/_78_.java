package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _78_ {
    public List<List<Integer>> subsets(int[] nums) {
        List rs = new ArrayList();

        return rs;
    }
    List<List<Integer>> rs = null;
    //dfs
    public void subsets(int[] nums,int i,List<Integer> item){
        //不选择
        rs.add(item);
        //选择
        item.add(nums[i]);
        rs.add(new ArrayList<>(item));

    }
}
