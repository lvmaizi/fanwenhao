package com.example.fanwenhao.offer;

import java.util.ArrayList;
import java.util.List;

public class _17_ {
    public int[] printNumbers(int n) {
        int num = (int) Math.pow(10, n) - 1;
        int[] result = new int[num];
        for (int i = 0; i < result.length; i ++) {
            result[i] = i + 1;
        }
        return result;
    }
}
