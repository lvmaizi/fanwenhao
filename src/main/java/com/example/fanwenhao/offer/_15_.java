package com.example.fanwenhao.offer;

public class _15_ {
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                result ++;
            }
            n >>>= 1;
        }
        return result;
    }
    public int hammingWeight1(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
}
