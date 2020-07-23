package com.example.fanwwenhao.arithmetic.huawei;

import java.util.Arrays;

public class _4_5 {
    public static void main(String[] args) {
        int[] input = new int[]{1,1,1,1,1,1,1,1,4,4,3,1};
        Arrays.sort(input);
        int sum = 0;
        for (int i:input)sum+=i;
        for (int i=input[0];i<=sum/4;i++){
            int num = 0;
            num = num + getSumByOne(Arrays.copyOf(input,input.length),i);
            num = num + getSumByTwo(Arrays.copyOf(input,input.length),i);
            num = num + getSumByThree(Arrays.copyOf(input,input.length),i);
            num = num + getSumByFour(Arrays.copyOf(input,input.length),i);
            if(num>=4) System.out.println(i);
        }
    }
    //取一个 等于 的数量
    //取两个
    //取三个
    //取四个
    private static int getSumByOne(int[] input,int sum){
        int rs = 0;
        for (int i=0;i<input.length;i++){
            if(input[i] == sum)rs++;
        }
        return rs;
    }
    private static int getSumByTwo(int[] input,int sum){
        int rs = 0;
        for (int i=0;i<input.length;i++){
            for (int j=i+1;j<input.length;j++){
                if(input[i]!=-1 && input[j]!=-1){
                    if(input[i]+input[j] == sum){
                        rs++;
                        input[i] = -1;
                        input[j] = -1;
                    }
                }
            }
        }
        return rs;
    }
    private static int getSumByThree(int[] input,int sum){
        int rs = 0;
        for (int i=0;i<input.length;i++){
            for (int j=i+1;j<input.length;j++){
                for (int x=j+1;x<input.length;x++){
                    if(input[i]!=-1 && input[j]!=-1 && input[x]!=-1){
                        if(input[i]+input[j]+input[x] == sum){
                            rs++;
                            input[i] = -1;
                            input[j] = -1;
                            input[x] = -1;
                        }
                    }
                }
            }
        }
        return rs;
    }
    private static int getSumByFour(int[] input,int sum){
        int rs = 0;
        for (int i=0;i<input.length;i++){
            for (int j=i+1;j<input.length;j++){
                for (int x=j+1;x<input.length;x++){
                    for (int y=x+1;y<input.length;y++){
                        if(input[i]!=-1 && input[j]!=-1 && input[x]!=-1 && input[y]!=-1){
                            if(input[i]+input[j]+input[x]+input[y] == sum){
                                rs++;
                                input[i] = -1;
                                input[j] = -1;
                                input[x] = -1;
                                input[y] = -1;
                            }
                        }
                    }
                }
            }
        }
        return rs;
    }
}
