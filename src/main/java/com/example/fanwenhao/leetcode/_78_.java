package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _78_ {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        dfs(nums, 0, nums.length - 1, curr, result);
        result.add(new ArrayList<>());
        return result;
    }

    private void dfs(int[] nums, int start, int end, List<Integer> curr, List<List<Integer>> result) {
        if (start > end) {
            return;
        }
        if (curr.size() !=0 )
            result.add(new ArrayList<>(curr));
        for (int i = start; i <= end; i ++) {
            curr.add(nums[i]);
            dfs(nums, i + 1, end, curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}
