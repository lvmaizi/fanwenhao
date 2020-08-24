package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/30 10:54
 * @Version 1.0
 */
public class _112_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)return false;
        if(root.left == null && root.right == null && sum == root.val)return true;
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
}
