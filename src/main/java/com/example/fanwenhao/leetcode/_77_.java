package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _77_ {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[n + 1];
        List<Integer> curr = new ArrayList<>();
        dfs(1, n, k, used, curr, result);
        return result;
    }

    private void dfs(int start, int end, int k, boolean[] used, List<Integer> curr, List<List<Integer>> result) {
        if (curr.size() == k) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (start > end) {
            return;
        }
        for (int i = start; i <= end; i ++) {
            curr.add(i);
            dfs(i + 1, end, k, used, curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}
