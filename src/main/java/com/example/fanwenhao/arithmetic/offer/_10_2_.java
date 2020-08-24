package com.example.fanwenhao.arithmetic.offer;

public class _10_2_ {
    public int numWays(int n) {
        if(n<=1)return 1;
        if(n==2)return 2;
        int n0=1,n1=2,tmp;
        for (int i=3;i<=n;i++){
            tmp = n1;
            n1 = (n0+n1)%1000000007;
            n0 = tmp;
        }
        return n1;
    }
}
