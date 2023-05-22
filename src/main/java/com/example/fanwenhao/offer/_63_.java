package com.example.fanwenhao.offer;

public class _63_ {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE,maxResult = 0;
        for (int i = 1; i < prices.length ; i ++) {
            min = Math.min(min, prices[i]);
            maxResult = Math.max(maxResult, prices[i] - min);
        }
        return maxResult;
    }


}
