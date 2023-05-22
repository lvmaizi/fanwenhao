package com.example.fanwenhao.leetcode;

public class _200_ {
    public int numIslands(char[][] grid) {
        boolean[][] used = new boolean[grid.length][grid[0].length];
        int result = 0;
        for (int i = 0; i < grid.length; i ++) {
            for (int j = 0; j < grid[0].length - 1; j ++) {
                if (!used[i][j] && grid[i][j] == '1') {
                    dfs(grid, used, i, j);
                    result ++;
                }
            }
        }
        return result;
    }


    private int[][] f = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};


    private void dfs(char[][] grid, boolean[][] used, int i, int j) {
        if (grid[i][j] == '1') {
            used[i][j] = true;
        }
        for (int[] ints: f) {
            int x = ints[0] + i;
            int y = ints[1] + j;
            if (area(x, y, grid.length - 1, grid[0].length - 1) && !used[x][y] && grid[x][y] == '1') {
                dfs(grid, used, x, y);
            }
        }
    }

    private boolean area(int x, int y, int xMax, int yMax) {
        return x >= 0 && x <= xMax && y >= 0 && y <= yMax;
    }
}
