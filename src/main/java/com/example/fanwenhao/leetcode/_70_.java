package com.example.fanwenhao.leetcode;

public class _70_ {
//    public int climbStairs(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//        return climbStairs(n - 1) + climbStairs(n - 2);
//    }

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int tmp1 = 1;
        int tmp2 = 2;
        for (int i = 3; i <= n - 1; i ++) {
            int t = tmp1;
            tmp1 = tmp2;
            tmp2 = t + tmp2;
        }
        return tmp1 + tmp2;
    }
}
