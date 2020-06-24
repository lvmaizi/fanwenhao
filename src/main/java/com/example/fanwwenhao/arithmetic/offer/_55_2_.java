package com.example.fanwwenhao.arithmetic.offer;

/**
 * @Date 2020/6/24 15:45
 * @Version 1.0
 */
public class _55_2_ {
     class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        if(Math.abs(depth(root.right)-depth(root.left))>1)return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    //求树的深度
    public int depth(TreeNode root){
         if(root == null)return 0;
         if(root.left==null&&root.right==null)return 1;
         return Math.max(depth(root.left)+1,depth(root.right)+1);
    }
}
