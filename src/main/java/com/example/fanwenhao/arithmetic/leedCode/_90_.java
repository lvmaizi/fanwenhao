package com.example.fanwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _90_ {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        rs = new ArrayList();
        for (int i = 0;i <= nums.length; i++){
            subsetsWithDup(nums,0,i,new ArrayList<>());
        }
        return rs;
    }
    List rs = new ArrayList();
    public void subsetsWithDup(int[] nums,int start,int size, List<Integer> item){
        if(size == item.size()){
            rs.add(item);
            return;
        }
        for (int i = start;i < nums.length; i++){
            if(i != start && nums[i] == nums[i-1])continue;
            item.add(nums[i]);
            subsetsWithDup(nums,i+1,size,new ArrayList<>(item));
            item.remove(item.size()-1);
        }
    }

    public static void main(String[] args) {
        _90_ a = new _90_();
        a.subsetsWithDup(new int[]{1,2,2},0,3,new ArrayList<>());
        System.out.println();
    }
}
