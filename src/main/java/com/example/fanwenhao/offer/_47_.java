package com.example.fanwenhao.offer;

public class _47_ {
    int[][] max;
    public int maxValue(int[][] grid) {
        max = new int[grid.length][grid[0].length];
        for (int i = grid.length - 1; i >= 0; i --) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                int right = j == grid[0].length - 1 ? 0 : max[i][j + 1];
                int down = i == grid.length - 1 ? 0 : max[i + 1][j];
                max[i][j] = Math.max(right, down) + grid[i][j];
            }
        }
        return max[0][0];
    }


}
