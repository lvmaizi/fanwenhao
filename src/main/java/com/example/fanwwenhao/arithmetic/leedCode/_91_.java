package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/4/24 9:47
 * @Version 1.0
 */
public class _91_ {
    //假设不为零

    /**
     * 状态fi 从i-n的解码方法数
     * 状态转移方程
     */
    public int numDecodings(String s) {
        if(s.length() == 0)return 0;
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        if(s.charAt(0) == '0')return 0;
        for (int i = 2;i <= s.length(); i++){
            int sum = 0;
            if(s.charAt(i-2) != '0' && !(s.charAt(i-2) > '2' || (s.charAt(i-2) == '2' && s.charAt(i-1) > '6'))){
                sum = sum + dp[i - 2];
            }
            if(s.charAt(i-1) != '0'){
                sum = sum + dp[i-1];
            }
            dp[i] = sum;
        }
        return dp[s.length()];
    }

    int numDecodings1(String s) {
        if (s.charAt(0) == '0') return 0;
        int pre = 1, curr = 1;//dp[-1] = dp[0] = 1
        for (int i = 1; i < s.length(); i++) {
            int tmp = curr;
            if (s.charAt(i) == '0')
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') curr = pre;
                else return 0;
            else if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) >= '1' && s.charAt(i) <= '6'))
                curr = curr + pre;
            pre = tmp;
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println(new _91_().numDecodings1("11111"));
    }
}
