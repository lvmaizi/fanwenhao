package com.example.fanwenhao.offer;

public class _66_
{
    public int[] constructArr(int[] a) {
        int pre[] = new int[a.length];
        int post[] = new int[a.length];
        for (int i = 0; i < a.length; i ++) {
            if (i == 0) {
                pre[i] = a[0];
                continue;
            }
            pre[i] = a[i] * pre[i - 1];
        }
        for (int i = a.length - 1; i >=0; i --) {
            if (i == a.length - 1) {
                post[i] = a[i];
                continue;
            }
            post[i] = a[i] * post[i + 1];
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int left = i == 0 ? 1 : pre[i -1];
            int right = i == a.length - 1 ? 1 : post[i + 1];
            result[i] = left * right;
        }
        return result;
    }
}
