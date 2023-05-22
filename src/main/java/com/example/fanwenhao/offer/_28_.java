package com.example.fanwenhao.offer;

public class _28_ {
    public boolean isSymmetric(TreeNode root) {
        TreeNode node = mirrorTree(root);
        return isEquals(root, node);
    }
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode newNode = new TreeNode(root.val);
        newNode.left = mirrorTree(root.right);
        newNode.right = mirrorTree(root.left);
        return newNode;
    }
    private boolean isEquals(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.val == b.val) {
            return isEquals(a.left , b.left) && isEquals(a.right, b.right);
        }
        return false;
    }
}
