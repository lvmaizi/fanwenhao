package com.example.fanwwenhao.arithmetic.offer;

public class _10_ {
    public int fib(int n) {
        if(n == 0)return 0;
        if(n == 1)return 1;
        int n0=0,n1=1,tmp;
        for (int i=2;i<=n;i++){
            tmp = n1;
            n1 = (n1+n0)%1000000007;
            n0 = tmp;
        }
        return n1%1000000007;
    }

    public static void main(String[] args) {
        System.out.println(new _10_().fib(48));
    }
}
