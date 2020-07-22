package com.example.fanwwenhao.arithmetic.huawei;

import java.util.Arrays;

public class _4_5 {
    private static boolean[] used ;
    public static void main(String[] args) {
        int[] input = new int[]{1,1,1,1,1,1,1,1,4,4};
        used = new boolean[input.length];
        getSum(input,0,2,2);
        Arrays.sort(input);
        int sum = 0;
        for (int i:input)sum+=i;
        for (int i=input[0];i<=sum/4;i++){
            int num = 0;
            for (int j=1;j<=input.length;j++){
                num = num + getSum(input,0,j,i);
            }
            if(num>=4) System.out.println(i);
        }
    }
    //size个数字 和为sum 的数量
    private static int getSum(int[] input,int start,int size,int sum){
        if(sum == 0 && size == 0)return 1;
        if(sum<=0 || size <0)return 0;
        int rs = 0;
        for (int i=start;i<input.length;i++){

            used[i] = true;
            rs = rs + getSum(input,i+1,size-1,sum-input[i]);
        }
        return rs;
    }
}
