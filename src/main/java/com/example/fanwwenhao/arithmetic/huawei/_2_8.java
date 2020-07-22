package com.example.fanwwenhao.arithmetic.huawei;

public class _2_8 {
    public static void main(String[] args) {
        int a = 99999999;
        for (int i=1;i<=a;i++){
            if(a%i==0){
                if(isSushu(i)&&isSushu(a/i)){
                    System.out.println(i+"  "+a/i);
                }
            }
        }
    }
    static boolean isSushu(int a){
        for (int i=2;i<a-1;i++){
            if(a%i==0)return false;
        }
        return true;
    }
}
