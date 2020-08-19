package com.example.fanwwenhao.arithmetic.leedCode;

public class _96_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int numTrees(int n) {
        if(n < 1)return 0;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[0] = 1;
        for (int i = 2;i <= n;i ++){
            int sum = 0;
            for (int j = 0;j < i;j++){
                sum = sum + dp[j]*dp[i-j-1];
            }
            dp[i] = sum;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        //1767263190
        System.out.println(new _96_().numTrees(19));
    }
}
