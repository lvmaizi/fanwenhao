package com.example.fanwenhao.arithmetic.niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2020/7/20 9:11
 * @Version 1.0
 */
public class _01Knapsack {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bf.readLine())!=null){
            int num = Integer.parseInt(input);
            int knapsackMax = Integer.parseInt(bf.readLine());
            String[] w = bf.readLine().split(" ");
            String[] v = bf.readLine().split(" ");
            //定义状态方程
            int[][] maxV = new int[num][knapsackMax+1];
            //初始值赋值
            for (int i = 0;i<=knapsackMax;i++){
                if(i>=Integer.parseInt(w[num-1])){
                    maxV[num-1][i] = Integer.parseInt(v[num-1]);
                }
            }
            for (int i=num-2;i>=0;i--){
                for (int j=0;j<=knapsackMax;j++){
                    //放入当前物品
                    if(Integer.parseInt(w[i])<=j){
                        maxV[i][j] = Integer.parseInt(v[i]) + maxV[i+1][j-Integer.parseInt(w[i])];
                    }
                    //不放入
                    maxV[i][j] = Math.max(maxV[i][j],maxV[i+1][j]);
                }
            }
            System.out.println(maxV[0][knapsackMax]);
        }
    }
}
