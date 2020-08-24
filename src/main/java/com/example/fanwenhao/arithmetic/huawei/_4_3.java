package com.example.fanwenhao.arithmetic.huawei;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2020/7/24 11:04
 * @Version 1.0
 */
public class _4_3 {
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,6,7,8};
        int sum = 15;
        List rs = new ArrayList();
        for (int i = 1;i <= input.length;i++){
            //几个
            for (int j = 0;j < input.length-i+1;j ++){
                int sumTmp = 0;
                for (int x = j;x < j+i; x++){
                    sumTmp = sumTmp + input[x];
                }
                if(sumTmp == sum){
                    List r = new ArrayList();
                    add(r,input,j,j+i-1);
                    rs.add(r);
                }
            }
        }
        System.out.println(rs);
    }
    private static void add(List rs,int[] input,int start,int end){
        for (int i = start;i <= end; i++){
            rs.add(input[i]);
        }
    }
}
