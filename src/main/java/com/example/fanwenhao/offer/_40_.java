package com.example.fanwenhao.offer;

import java.util.Arrays;

public class _40_ {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, 0, k);
    }
}
