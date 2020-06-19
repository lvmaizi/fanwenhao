package com.example.fanwwenhao.arithmetic.leedCode;

import org.drools.core.util.LinkedList;

/**
 * @Date 2020/6/17 18:55
 * @Version 1.0
 */
public class _123_ {
    public int maxProfit(int[] prices) {
        if(prices.length<2)return 0;
        //定义状态 第几天 持有与否 卖出几次 (结果利润最大)
        int[][][] v = new int[prices.length][2][prices.length+2];
        v[0][1][0] = 0-prices[0];
        v[0][1][1] = Integer.MIN_VALUE/2;
        v[0][0][1] = Integer.MIN_VALUE/2;
        for (int i=1;i<prices.length;i++){
            //未持有也从未卖出
            v[i][0][0] = 0;
            //未持有但卖出过一次(卖出一次有可能是今天卖的，也有可能是在今天之前卖的)
            v[i][0][1] = Math.max(prices[i]+v[i-1][1][0],v[i-1][0][1]);
            //未持有但卖出过两次（今天卖一次，或前几天卖两次）
            v[i][0][2] = Math.max(v[i-1][1][1]+prices[i],v[i-1][0][2]);
            //持有从未卖出,有可能是今天持有或今天之前就已经持有
            v[i][1][0] = Math.max(v[i-1][0][0]-prices[i],v[i-1][1][0]);
            //持有但卖出过一次,今天持有或之前持有
            v[i][1][1] = Math.max(v[i-1][0][1]-prices[i],v[i-1][1][1]);
            //持有卖出过两次 (不允许继续持有了，默认0)

        }
        return Math.max(v[prices.length-1][0][2],v[prices.length-1][0][1]);
    }

    public static void main(String[] args) {
        System.out.println(new _123_().maxProfit(new int[]{1,2}));
    }
}
