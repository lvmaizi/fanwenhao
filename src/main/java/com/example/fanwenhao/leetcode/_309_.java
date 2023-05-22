package com.example.fanwenhao.leetcode;

public class _309_ {
    public int maxProfit(int[] prices) {
        // result[i] -> [i,length-1]的最大收益
        int result[] = new int[prices.length + 1];
        result[prices.length - 1] = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            for (int j = i + 1; j <= prices.length - 1; j++) {
                // buy
                int fMax = j + 2 > prices.length - 1 ? 0 : result[j + 2];
                result[i] = Math.max(result[i], prices[j] - prices[i] + fMax);
                result[i] = Math.max(result[i], result[j]);
            }

        }
        return result[0];
    }
}
