package com.example.fanwwenhao.arithmetic.offer;

/**
 * @Date 2020/7/1 14:13
 * @Version 1.0
 */
public class _17_ {
    public int[] printNumbers(int n) {
        StringBuffer s = new StringBuffer();
        for (int i=0;i<n;i++){
            s.append("9");
        }
        int max = Integer.valueOf(s.toString());
        int[] result = new int[max];
        for (int i=1;i<=max;i++){
            result[i-1] = i;
        }
        return result;
    }
}
