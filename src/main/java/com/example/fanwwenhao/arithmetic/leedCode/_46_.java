package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _46_ {
    List results = new ArrayList();
    boolean used[];
    public void subPermute(int[] nums,List str){
        if(str.size()==nums.length){
            results.add(str);
            return;
        }
        //需要一个额外数组存储当前位置是否已经参与排列
        for (int i=0;i<nums.length;i++){
            if(used[i] == false){
                used[i]=true;
                str.add(nums[i]);
                List newL = new ArrayList(str);
                subPermute(nums, newL);
                str.remove(str.size()-1);
                used[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0)return results;
        used = new boolean[nums.length];
        subPermute(nums,new ArrayList<Integer>());
        return results;
    }

    public static void main(String[] args) {
        List<List<Integer>> l = new _46_().permute(new int[]{1,2,3});
        System.out.println("3");
    }
}
