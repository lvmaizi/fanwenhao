package com.example.fanwwenhao.arithmetic.huawei;

public class _4_4 {
    public static void main(String[] args) {
        int start = 0,end =10;
        for (int a = start;a<end-1;a++){
            for (int b=a+1;b<end;b++){
                for (int c = b+1;c<=end;c++){
                    if(a*a+b*b==c*c)
                        System.out.println(a+" "+b+" "+c);
                }
            }
        }
    }
}
