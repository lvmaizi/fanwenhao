package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Date 2020/7/29 10:04
 * @Version 1.0
 */
public class _40_ {
    List rs = new ArrayList();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates,0,new ArrayList(),target);
        return rs;
    }
    private void dfs(int[] candidates,int start,List rsItem,int target){
        if (target == 0){
            rs.add(rsItem);
            return;
        }
        if (target < 0 || start >= candidates.length)return;
        int count = 1;
        int index = start;
        while (index+1 < candidates.length && candidates[index] == candidates[index+1]){
            count ++;
            index++;
        }
        for (int i = 0;i <= count; i++){
            if(target-candidates[start]*i <0)break;
            dfs(candidates,start+count,new ArrayList(rsItem),target-candidates[start]*i);
            rsItem.add(candidates[start]);
        }
    }
}
