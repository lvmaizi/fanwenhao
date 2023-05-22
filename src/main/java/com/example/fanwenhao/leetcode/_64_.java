package com.example.fanwenhao.leetcode;

import java.util.Arrays;

public class _64_ {
    public int minPathSum(int[][] grid) {
        int[][] tmp = new int[grid.length][grid[0].length];
        for (int i = grid.length - 1; i >= 0; i --) {
            for (int j = grid[0].length - 1; j >= 0; j --) {
                int right = 0;
                int down = 0;
                boolean isEdge = false;
                if (j !=  grid[0].length - 1) {
                    right = tmp[i][j + 1];
                } else {
                    isEdge = true;
                }
                if (i != grid.length - 1) {
                    down = tmp[i + 1][j];
                } else {
                    isEdge = true;
                }

                tmp[i][j] = grid[i][j] + (isEdge ? Math.max(right, down) : Math.min(right, down));
            }
        }
        return tmp[0][0];
    }
}
