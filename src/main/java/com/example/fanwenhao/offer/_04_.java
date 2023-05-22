package com.example.fanwenhao.offer;

public class _04_ {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = 0;
        int cell = matrix[0].length - 1;
        while (row <= matrix.length - 1 && cell >= 0) {
            if(matrix[row][cell] == target) {
                return true;
            } else if (matrix[row][cell] > target) {
                cell --;
            } else {
                row ++;
            }
        };
        return false;
    }
}
