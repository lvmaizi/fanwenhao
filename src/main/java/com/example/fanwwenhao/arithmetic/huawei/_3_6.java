package com.example.fanwwenhao.arithmetic.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2020/7/14 17:06
 * @Version 1.0
 */
public class _3_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        System.out.println("a b".split(" ").length);
        while ((input = bf.readLine())!=null){
            String[] inputs = input.split(" ");
            int [][] a = new int[Integer.parseInt(inputs[0])][Integer.parseInt(inputs[1])];
            for (int i=0;i<Integer.parseInt(inputs[0]);i++){
                input = bf.readLine();
                String[] t = input.split(" ");
                for (int j=0;j<Integer.parseInt(inputs[1]);j++){
                    a[i][j] = Integer.parseInt(t[j]);
                }
            }
            System.out.println(max(a));
        }
    }
    private static int max(int [][] a){
        a = new int[][]{{9,-8,1,3,-2},{-3,7,6,-2,4},{6,-4,-4,8,-7}};
        int max = a[0][0];
        int[] result = new int[4];
        int[] dp = new int[a[0].length];
        for(int i=0;i<a.length;i++){
            for (int o=0;o<dp.length;o++)dp[o]=0;
            for (int j=i;j<a.length;j++){
                //设置dp
                int pre = 0,start=0;
                for (int c=0;c<dp.length;c++){
                    dp[c] = dp[c]+ a[j][c];
                    if(pre>0){
                        pre = pre+dp[c];
                    }else {
                        pre = dp[c];
                        start = c;
                    }
                    if(pre > max){
                        max = pre;
                        result[0] = i;
                        result[1] = start;
                        result[2] = j;
                        result[3] = c;
                    }
                }

            }
        }
        return max;
    }

}
