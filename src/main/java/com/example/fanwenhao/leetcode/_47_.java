package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _47_ {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, 0, nums.length - 1, used, curr, result);
        return result;
    }

    private void dfs(int[] nums, int start, int end, boolean[] used, List<Integer> curr, List<List<Integer>> result) {
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }
        boolean[] usedA = new boolean[nums.length];
        for (int i = start; i <= end; i ++) {
            if (used[i]) {
                continue;
            }
            boolean flag = false;
            for (int j = start; j <= end; j ++) {
                if (usedA[j] && nums[j] == nums[i]) {
                    flag = true;
                    break;
                }
            }
            if  (flag) {
                continue;
            }
            usedA[i] = true;
            used[i] = true;
            curr.add(nums[i]);
            dfs(nums, start, end, used, curr, result);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}
