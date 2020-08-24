package com.example.fanwenhao.arithmetic.leedCode;

public class _50_ {
    public double myPow(double x, int n) {
        if(n == 0)return 1;
        if(n > 0)return myPow1(x,n);
        return 1.0 / myPow1(x,-n);
    }
    public double myPow1(double x, int n){
        if(n == 0) return 1;
        double t = myPow1(x,n / 2);
        if((n & 1) == 1){
            return t * t * x;
        }else return t * t;
    }

    public static void main(String[] args) {
        System.out.println(new _50_().myPow(1.0, -2147483648));
    }
}
