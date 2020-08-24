package com.example.fanwenhao.arithmetic.leedCode;

public class _48_ {
    public void rotate(int[][] matrix) {
        matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] rs = new int[][]{
                {1,4,7},
                {2,5,8},
                {3,6,9},

                {7,4,1},
                {8,5,2},
                {9,6,3}
        };
        //转置矩阵
        int n = matrix.length;
        for (int i = 0; i < n;i ++){
            for (int j = i; j < n;j ++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for (int i = 0; i < n;i ++){
            for (int j = 0;j < n/2; j++){
                int tmp = matrix[i][n-j-1];
                matrix[i][n-j-1] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
        System.out.println("s");
    }

    public static void main(String[] args) {
        new _48_().rotate(new int[][]{});
    }
}
