package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/5/15 11:37
 * @Version 1.0
 */
public class _322_ {
    public int coinChange(int[] coins, int amount) {

        return -1;
    }
    //递归求得硬币个数
    public int method(int[] coins, int amount, int length, int history){
        if(length<0 || amount<0)return -1;
        int val = method(coins,amount-coins[length],length-1,history);
        return 0;
    }
}
