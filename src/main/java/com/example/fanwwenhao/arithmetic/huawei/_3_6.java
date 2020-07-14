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
        //求列的最大子数组和
        int[][] cel = new int[a.length][a[0].length];
        for (int i=0;i<a[0].length;i++){
            int pre = a[0][i];
            cel[0][i] = a[0][i];
            for (int j=1;j<a.length;j++){
                if(pre >0){
                    cel[j][i] = pre + a[j][i];
                    pre = cel[j][i];
                }else {
                    cel[j][i] = a[j][i];
                    pre = cel[j][i];
                }
            }
        }
        int result = cel[0][0];
        for (int i=0;i<cel.length;i++){
            int pre = cel[i][0];
            for (int j=1;j<cel[0].length;j++){
                if(pre >0){
                    result = Math.max(result,pre+cel[i][j]);
                    pre = pre+cel[i][j];
                }else {
                    pre = cel[i][j];
                    result = Math.max(result,cel[i][j]);
                }
            }
        }
        return result;
    }

}
