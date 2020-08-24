package com.example.fanwenhao.arithmetic.offer;

/**
 * @Date 2020/6/28 15:38
 * @Version 1.0
 */
public class _16_ {
    public double myPow(double x, int n) {
        if (n==0)return 1.0;
        double result = 1;
        if(n>0){
            while (n>0){
                result = result*x;
                n--;
            }
        }else {
            n = -n;
            while (n>0){
                result = result*x;
                n--;
            }
            result = 1/result;
        }
        return result;
    }
}
