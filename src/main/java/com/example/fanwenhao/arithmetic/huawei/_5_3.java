package com.example.fanwenhao.arithmetic.huawei;

import java.util.HashSet;
import java.util.Set;

/**
 * @Date 2020/7/23 16:56
 * @Version 1.0
 */
public class _5_3 {
    public static void main(String[] args) {
//        System.out.println(1203/100*15);
        int[][] input = new int[3][3];
        input[0] = new int[]{1,0,233};
        input[1] = new int[]{2,0,323};
        input[2] = new int[]{3,2,1203};
//        Arrays.sort(input,(a,b)->a[1]-b[1]);
//        int i = input.length-1;
//        int leverIncome = 0;
//        int sum = 0;
//        while (i>=0){
//            int lever = input[i][1];
//            //求此级别获得的下级收入
//            sum = leverIncome;
//            while (i>=0 && input[i][1] == lever){
//                sum = sum + input[i][2];
//                i--;
//            }
//            leverIncome = sum/100*15;
//        }
//        System.out.println(leverIncome);
        //找到顶级代理商
        int top = 0;
        Set set = new HashSet<>();
        for (int i=0;i<input.length;i++){
            set.add(input[i][0]);
        }
        for (int i=0;i<input.length;i++){
            if(!set.contains(input[1])){
                top = input[i][1];
                break;
            }
        }
        //dfs回溯
        System.out.println(dfs(input, top));
    }
    //代理商的收入
    private static int  dfs(int[][] input,int proxy){
        int sum = 0;
        //自己的收入
        for (int i=0;i<input.length;i++){
            if(input[i][0] == proxy)
                sum = sum + input[i][2];
        }
        //下层收入
        for (int i=0;i<input.length;i++){
            if(input[i][1] == proxy){
                sum = sum + dfs(input,input[i][0])/100*15;
            }
        }
        return sum;
    }
}
