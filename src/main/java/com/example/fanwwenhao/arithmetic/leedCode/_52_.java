package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/6/19 11:25
 * @Version 1.0
 */
public class _52_ {
    int result;
    //当前行是否被占用
    int[] row;
    //当前列是否被占用
    int[] cell;
    // / 这个斜线是否被占用
    int [] a;
    // \这个斜线是否被占用
    int [] b;
    public int totalNQueens(int n) {
        //当前行是否被占用
        row = new int[n];
        //当前列是否被占用
        cell = new int[n];
        // / 这个斜线是否被占用
        a = new int[2*n-1];
        // \这个斜线是否被占用
        b = new int[2*n-1];
        result = 0;
        totalNQueens(0,n);
        return result;
    }
    private void totalNQueens(int start,int n){
        if(start>=n){
            result++;
            return;
        }
        for (int i=0;i<n;i++){
            if(isValid(start,i,n)){
                put(start,i,n);
                totalNQueens(start+1,n);
                remove(start,i,n);
            }
        }
    }
    //是否允许放入
    public boolean isValid(int i,int j,int n){
        return row[i] == 0
                && cell[j] == 0
                && a[i+j] == 0
                && b[(i-j)+n-1] == 0;
    }
    //设置放入标志
    public void put(int i,int j,int n){
        row[i]=1;
        cell[j]=1;
        a[i+j]=1;
        b[(i-j)+n-1]=1;
    }
    //设置取消标志
    public void remove(int i,int j,int n){
        row[i]=0;
        cell[j]=0;
        a[i+j]=0;
        b[(i-j)+n-1]=0;
    }

    public static void main(String[] args) {
        new _52_().totalNQueens(4);
    }
}
