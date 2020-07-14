package com.example.fanwwenhao.arithmetic.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2020/7/14 16:42
 * @Version 1.0
 */
public class _3_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bf.readLine())!=null){
            int k=3,n=2;
            String result = "";
            int[] c = new int[k];
            c[0]=1;
            for (int i=1;i<k;i++){
                c[i] = c[i-1]*(i+1);
            }
            for (int i=k-1;i>0;i--){
                result += (n/c[i-1]+1);
                n = n%c[i-1];
            }
            result += n;
            System.out.println(result);
        }
    }
//    //计算n!
//    public static int cal(int n){
//
//    }
}
