package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.Arrays;

/**
 * @Date 2020/7/23 14:36
 * @Version 1.0
 */
public class _56_ {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1,2},
                {4,5},
                {3,4}
        };
        Arrays.sort(a,(c,b)->{
            return c[0]-b[0];
        });
        System.out.println("");
    }
}
