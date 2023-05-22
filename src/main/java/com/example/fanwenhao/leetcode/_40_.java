package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _40_ {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, 0, candidates.length - 1, curr, result, target);
        return result;
    }

    private void dfs(int[] candidates, int start, int end, List<Integer> curr, List<List<Integer>> result, int target) {
        if (target == 0 && curr.size() != 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (target <= 0) {
            return;
        }
        for (int i = start; i <= end; i++) {
            if (i -1 >=  start && candidates[i] == candidates[i-1]) {
                continue;
            }
            curr.add(candidates[i]);
            dfs(candidates, i + 1, end, curr, result, target -  candidates[i]);
            curr.remove(curr.size() - 1);

        }
    }
}
