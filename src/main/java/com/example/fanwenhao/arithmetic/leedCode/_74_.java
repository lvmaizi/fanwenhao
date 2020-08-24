package com.example.fanwenhao.arithmetic.leedCode;

public class _74_ {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)return false;
        int i = 0,j = matrix.length * matrix[0].length - 1;
        while (i <= j){
            int mid = (i+j)/2;
            int midX = mid/matrix[0].length;
            int midY = mid%matrix[0].length;
            if(target == matrix[midX][midY])return true;
            if(target > matrix[midX][midY])i = mid + 1;
            if(target < matrix[midX][midY])j = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new _74_().searchMatrix(new int[][]{
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        }, 50));
    }
}
