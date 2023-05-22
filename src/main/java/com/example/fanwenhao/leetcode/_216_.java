package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _216_ {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        dfs(k, n,1, 9,curr, result);
        return result;
    }

    private void dfs(int k, int n, int start, int end, List<Integer> curr, List<List<Integer>> result) {
        System.out.println("= =" + k + "  " + n + "  " + start);
        if (k == 0 && n== 0 ) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (k <= 0 || n <= 0) {
            return;
        }
        for (int i = start; i <= end; i ++) {
            curr.add(i);
            dfs(k - 1, n - i, i + 1, end, curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}
