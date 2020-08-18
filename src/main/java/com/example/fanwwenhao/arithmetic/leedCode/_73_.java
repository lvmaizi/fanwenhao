package com.example.fanwwenhao.arithmetic.leedCode;

public class _73_ {
    public void setZeroes(int[][] matrix) {
        if(matrix.length == 0)return;
        boolean[] row = new boolean[matrix.length];
        boolean[] cell = new boolean[matrix[0].length];
        for (int i = 0;i < matrix.length; i++){
            for (int j = 0;j < matrix[0].length; j++){
               if(matrix[i][j] == 0){
                   row[i] = true;
                   cell[j] = true;
               }
            }
        }
        for (int i = 0;i < row.length; i++){
            if(row[i] == true){
                for (int j = 0;j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0;i < cell.length; i++){
            if(cell[i] == true){
                for (int j = 0;j < matrix.length; j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
