package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/6/17 16:19
 * @Version 1.0
 */
public class _121_ {
    public int maxProfit(int[] prices) {
        return 0;
    }
    //二层for
    public int maxProfit1(int[] prices) {
        int result = 0;
        for (int i=0;i<prices.length;i++){
            int max=0;
            for (int j=i+1;j<prices.length;j++){
                max = Math.max(max,prices[j]);
            }
            if(max>prices[i]){
                result = Math.max(result,max-prices[i]);
            }
        }
        return result;
    }
    //一层for
    public int maxProfit2(int[] prices) {
        int result = 0;
        //i - > length 的最大值
        int max=0;
        for (int i = prices.length-1;i>0;i--){
            max = Math.max(max,prices[i]);
            if(prices[i-1]<max){
                result = Math.max(result,max-prices[i-1]);
            }
        }
        return result;
    }
}
