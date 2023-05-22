package com.example.fanwenhao.offer;

public class _55_ {
    int depth = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


}
