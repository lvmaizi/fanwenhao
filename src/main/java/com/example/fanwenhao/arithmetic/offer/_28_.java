package com.example.fanwenhao.arithmetic.offer;

public class _28_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return isMirror(root.right,root.left);
    }
    public boolean isMirror(TreeNode A,TreeNode B){
        if(A == null && B == null)return true;
        if(A == null && B != null)return false;
        if(A != null && B == null)return false;
        if(A.val != B.val)return false;
        else {
            return isMirror(A.left,B.right) && isMirror(A.right,B.left);
        }
    }
}
