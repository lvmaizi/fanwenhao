package com.example.fanwenhao.leetcode;

public class _63_ {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length - 1;
        int cell = obstacleGrid[0].length - 1;
        int[][] result = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i= row; i >= 0; i --) {
            for (int j = cell; j >=0; j --) {
                // 初始值
                if (i==row && j==cell) {
                    if (obstacleGrid[row][cell] == 1) {
                        result[i][j] = 0;
                    }
                    else {
                        result[i][j] = 1;
                    }
                    continue;
                }
                if (obstacleGrid[i][j] == 1) {
                    result[i][j] = 0;
                    continue;
                }
                int right = j == cell ? 0 : result[i][j + 1];
                int down = i == row ? 0 : result[i + 1][j];
                result[i][j] = right + down;
            }
        }
        return result[0][0];
    }
}
