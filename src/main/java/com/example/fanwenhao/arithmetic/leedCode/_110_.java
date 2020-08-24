package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/30 10:26
 * @Version 1.0
 */
public class _110_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        if(Math.abs(size(root.left) - size(root.right)) >1)return false;
        return isBalanced(root.right) && isBalanced(root.right);
    }
    public int size(TreeNode root){
        if(root == null)return 0;
        return Math.max(size(root.left),size(root.right)) + 1;
    }
}
