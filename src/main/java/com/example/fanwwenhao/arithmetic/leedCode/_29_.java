package com.example.fanwwenhao.arithmetic.leedCode;

public class _29_ {
    public int divide(int dividend, int divisor) {
        boolean flag = true;
        if(dividend >0 && divisor <0)flag = false;
        if(dividend <0 && divisor >0)flag = false;
        dividend = dividend > 0? -dividend:dividend;
        divisor = divisor > 0? -divisor:divisor;
        int rs = div(dividend,divisor);
        if(flag){
            return rs == Integer.MIN_VALUE?Integer.MAX_VALUE:-rs;
        }
        return rs;
    }
    //均为负数
    public int div(int a,int b){
        if(a > b)return 0;
        int b1 = b;
        int count = 1;
        while (a < b1 + b1 && b1 +b1 < 0){
            b1 =  b1 + b1;
            count = count + count;
        }
        return -count + div(a - b1,b);
    }
    public static void main(String[] args) {
            System.out.println(Integer.MIN_VALUE-Integer.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE-2);
        System.out.println(new _29_().divide(2147483647, 3));
    }
}
