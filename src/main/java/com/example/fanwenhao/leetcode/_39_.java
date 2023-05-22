package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _39_ {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        dfs(candidates, 0, candidates.length - 1, target, curr, result);
        return result;
    }

    private void dfs(int[] candidates, int start, int end, int target, List<Integer> curr, List<List<Integer>> result) {
        if (target == 0 && curr.size() != 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i =  start; i <= end; i++) {
            curr.add(candidates[i]);
            dfs(candidates, i, end, target - candidates[i], curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}
