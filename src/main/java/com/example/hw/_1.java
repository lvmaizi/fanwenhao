package com.example.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        while ((input = bf.readLine()) != null){
            int size = Integer.parseInt(input);
            if (size <= 0){
                System.out.println(0);
                continue;
            }
            int[][] arr = new int[size][3];
            for (int i = 0;i < size; i++){
                String s = bf.readLine();
                String[] s1 = s.split(" ");
                arr[i][0] = Integer.parseInt(s1[0]);
                arr[i][1] = Integer.parseInt(s1[1]);
                arr[i][2] = Integer.parseInt(s1[2]);
            }
            //
            System.out.println(minExpend(arr));
        }
    }
    //求最小消耗
    private static int minExpend(int[][] input){
        int[] dp = new int[3];
        dp[0] = input[input.length-1][0];
        dp[1] = input[input.length-1][1];
        dp[2] = input[input.length-1][2];
        int[] dpNew = new int[3];
        for (int i = input.length - 2;i >= 0;i--){
            dpNew[0] = Math.min(dp[1],dp[2]) + input[i][0];
            dpNew[1] = Math.min(dp[0],dp[2]) + input[i][1];
            dpNew[2] = Math.min(dp[0],dp[1]) + input[i][2];
            int[] tmp = dp;
            dp = dpNew;
            dpNew = tmp;
        }
        return Math.min(Math.min(dp[0],dp[1]),dp[2]);
    }
}
