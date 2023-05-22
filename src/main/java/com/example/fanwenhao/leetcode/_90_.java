package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _90_ {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        dfs(nums, 0, nums.length-1, curr,result);
        return result;
    }

    private void dfs(int[] nums, int start, int end, List<Integer> curr, List<List<Integer>> result) {
        System.out.println(" " + curr  + " " + start + 1+ " " + end + 1);
        result.add(new ArrayList<>(curr));
        if (start > end) {
            return;
        }
        for (int i = start; i <= end; i++) {
            if (i - 1 >=  start && nums[i - 1] == nums [i]) {
                continue;
            }
            curr.add(nums[i]);
            dfs(nums, start + 1, end, curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}
