package com.example.fanwwenhao.arithmetic.leedCode;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2020/7/29 9:18
 * @Version 1.0
 */
public class _39_ {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List[] dpPre = new ArrayList[target];
        List[] dpPost = new ArrayList[target];
        for (int i = 0;i < target; i++){
            dpPre[i] = new ArrayList();
            dpPost[i] = new ArrayList();
            if(candidates[candidates.length-1] > i + 1)continue;
            else {
                int s = candidates[candidates.length-1];
                int sum = 1;
                List list = new ArrayList();
                while (s <= i + 1){
                    if(s == i + 1){
                        for (int j = 0;j < sum; j++){
                            list.add(candidates[candidates.length-1]);
                        }
                    }else {
                        sum ++;
                        s = candidates[candidates.length-1] * sum;
                    }
                }
                if (list.size()>0)dpPre[i].add(list);
            }
        }
        for (int i = candidates.length - 2;i >= 0;i--){
            while (candidates[i] <= target){
            }
        }
        return null;
    }

    List rs = new ArrayList();
    public List<List<Integer>> combinationSum1(int[] candidates, int target) {
        dfs(candidates,0,new ArrayList(),target);
        return rs;
    }
    public void dfs(int[] candidates,int start,List rsItem,int target){
        if(target == 0){
            rs.add(rsItem);
            return;
        }
        if(target < 0 || start >= candidates.length)return;
        int count = 0;
        while (candidates[start] * count <= target){
            for (int i = 0;i < count; i++){
                rsItem.add(candidates[start]);
            }
            dfs(candidates,start+1,new ArrayList(rsItem),target-(count * candidates[start]));
            for (int i = 0;i < count; i++){
                rsItem.remove(rsItem.size()-1);
            }
            count ++;
        }
    }
}
