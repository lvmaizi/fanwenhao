package com.example.fanwenhao.offer;

public class _54_ {
    int result,k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return result;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        k --;
        System.out.println(k);
        if (k == 0) {
            result = root.val;
            return;
        }
        dfs(root.left);
    }
}
