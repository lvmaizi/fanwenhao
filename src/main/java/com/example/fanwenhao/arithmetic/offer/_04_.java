package com.example.fanwenhao.arithmetic.offer;

public class _04_ {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //二分查找分四份
        if (matrix.length==0)return false;
        return findNumberIn2DArray(matrix,target,0,matrix.length-1,0,matrix[0].length-1);
    }
    public boolean findNumberIn2DArray(int[][] matrix, int target, int row1, int row2,int cell1,int cell2) {
        if(row1>row2 || cell1>cell2)return false;
        int mid1=0,mid2=0;
        mid1=(row1+row2)/2;
        mid2=(cell1+cell2)/2;
        if(matrix[mid1][mid2]==target)return true;
        if (matrix[mid1][mid2]<target){
            return findNumberIn2DArray(matrix,target,mid1+1,row2,mid2+1,cell2) ||
                    findNumberIn2DArray(matrix,target,row1,mid1,mid2+1,cell2) ||
                    findNumberIn2DArray(matrix,target,mid1+1,row2,cell1,mid2);
        }
        if(matrix[mid1][mid2]>target){
            return findNumberIn2DArray(matrix,target,row1,mid1,cell1,mid2) ||
                    findNumberIn2DArray(matrix,target,row1,mid1,mid2+1,cell2) ||
                    findNumberIn2DArray(matrix,target,mid1+1,row2,cell1,mid2);
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(new _04_().findNumberIn2DArray(new int[][]{
//                {1,   4,  7, 11, 15},
//                  {2,   5,  8, 12, 19},
//                    {3,   6,  9, 16, 22},
//                {10, 13, 14, 17, 24},
//                {18, 21, 23, 26, 30}},4));
        System.out.println(new _04_().findNumberIn2DArray(new int[][]{
                {1,   4,  7},
                {2,   5,  8},
                {3,   6,  9},
               },4));
    }
}
