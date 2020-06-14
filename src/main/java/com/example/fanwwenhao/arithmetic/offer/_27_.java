package com.example.fanwwenhao.arithmetic.offer;

public class _27_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null)return null;
        TreeNode l = root.left,r = root.right;
        root.left = mirrorTree(r);
        root.right = mirrorTree(l);
        return root;
    }
}
