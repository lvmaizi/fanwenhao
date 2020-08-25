package com.example.fanwenhao.arithmetic.leedCode;

public class _129_ {
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
    private int rs;
    public int sumNumbers(TreeNode root) {
        if(root == null)return 0;
        sumNumbers(root,0);
        return rs;
    }
    public void sumNumbers(TreeNode root,int preSum) {
        preSum = preSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            rs = rs + preSum;
            return;
        }
        if (root.left != null)
            sumNumbers(root.left,preSum);
        if(root.right != null)
            sumNumbers(root.right,preSum);
    }
}
