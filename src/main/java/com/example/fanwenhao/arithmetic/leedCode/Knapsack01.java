package com.example.fanwenhao.arithmetic.leedCode;

import java.util.Arrays;

/**
 * @Date 2020/4/23 13:38
 * @Version 1.0
 */
public class Knapsack01 {
    int history[][];
    /**
     * 01背包
     */
    public int maxValue(int[] items,int[] values,int c){
        history = new int[items.length][c];
        for (int i=0;i<items.length;i++)
        Arrays.fill(history[i],-1);
        return maxValueA(items,values,items.length-1,c);
    }

    /**
     * 0 - index 容量为c 求最大
     * 递推关系
     */
    public int maxValueA(int[] items,int[] values,int index,int c){
        if(index <0 || c <0) return 0;
        if(history[index][c-1] != -1)return history[index][c-1];
        int res = maxValueA(items,values,index-1,c);
        if (c>=items[index]){
            res = Math.max(res,values[index] + maxValueA(items,values,index-1,c-items[index]));
        }
        history[index][c-1] = res;
        return res;
    }

    /**
     * 动态规划结果
     * @return
     */
    public int maxValueDp(int[] items,int[] values,int c){
        int[][] res = new int[items.length][c];
        //赋初值
        for (int i = 0;i<c;i++){
            if(i+1>=values[0]){
                res[0][i] = values[0];
            }
        }
        //求0-i
        for (int i=1;i<items.length;i++){
            for (int j=0;j<c;j++){
                int r = res[i-1][j];
                if(j+1>=items[i])r = Math.max(r,res[i-1][j+1-items[i]]+values[i]);
                res[i][j] = r;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] items = new int[]{2, 3, 2, 1};
        int[] values = new int[]{4, 8, 10, 5};
        int a = new Knapsack01().maxValueDp(items,values,10);
        System.out.println(a);
    }
}
