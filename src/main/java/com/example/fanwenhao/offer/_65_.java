package com.example.fanwenhao.offer;

public class _65_ {
    public int add(int a, int b) {
        while (b == 0) {
            int c = a & b << 1;
            a = a ^ b;
            b = c;
        }
        return a;
    }
}
