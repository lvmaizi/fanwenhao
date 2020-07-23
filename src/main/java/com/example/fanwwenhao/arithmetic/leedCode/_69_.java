package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/23 16:05
 * @Version 1.0
 */
public class _69_ {
    public int mySqrt(int x) {
        int i = 0;
        while (true){
            if(i * i > x)break;
            if(i * i == x)return i;
            i++;
        }
        return i-1;
    }

    public static void main(String[] args) {
        new _69_().mySqrt(9);
    }
}
