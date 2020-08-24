package com.example.fanwenhao.arithmetic.offer;

/**
 * @Date 2020/6/28 15:10
 * @Version 1.0
 */
public class _15_ {
    public int hammingWeight(int n) {
        int result = 0,tmp=1;
        for (int i=0;i<32;i++){
            if((n & tmp) > 0){result++;}
            tmp = tmp <<1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new _15_().hammingWeight(8));
    }
}
