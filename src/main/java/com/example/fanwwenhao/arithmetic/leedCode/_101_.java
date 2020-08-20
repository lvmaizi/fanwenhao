package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2019/12/20 11:26
 * @Version 1.0
 */

public class _101_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null)return true;
        if(root1 == null || root2 == null)return false;
        if(root1.val != root2.val)return false;
        return isSymmetric(root1.left,root2.right) && isSymmetric(root1.right,root2.left);
    }
}
