package com.example.fanwwenhao.arithmetic.huawei;

public class _5_11 {
    public static void main(String[] args) {
        int[] input = new int[]{0,0,0,2,1};
        //计算喊过的次数
        int sum = 0;
        for (int i=0;i<input.length;i++){
            sum = sum + input[i];
        }
        int[] result = new int[input.length];
        int index = 0;
        int count = 0;
        while (sum>0){
            count++;
            if(isAccess(count)){
                result[index]++;
                sum--;
            }
            if(index == input.length-1)index = 0;
            else index++;
        }
        System.out.println("");
    }
    private static boolean isAccess(int i){
        if(i%7 == 0)return true;
        while (i>0){
            if(i%10 == 7)return true;
            i = i/10;
        }
        return false;
    }
}
