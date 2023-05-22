package com.example.fanwenhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _51_ {
    public List<List<String>> solveNQueens(int n) {
        boolean[] zXie = new boolean[2 * n];
        boolean[] fXie = new boolean[2 * n];
        boolean[] row = new boolean[n];
        boolean[] cell = new boolean[n];

        List<List<String>> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        dfs(n, 0, n, zXie, fXie, row, cell, curr, result);
        return result;
    }

    private void dfs(int n, int start, int end, boolean[] zXie, boolean[] fXie, boolean[] row, boolean[] cell, List<String> curr, List<List<String>> result) {
        for (int i = 0; i < n; i ++) {
            if (isCan(start, i, zXie, fXie, row, cell)) {
                int sum = start + i;
                zXie[sum] = true;
                fXie[sum] = true;
            }
        }
    }

    private boolean isCan(int x, int y , boolean[] zXie, boolean[] fXie, boolean[] row, boolean[] cell) {
        int sum = x + y;
        return !zXie[sum] && !fXie[sum] && !row[x] && !cell[y];
    }

}
