package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/30 11:10
 * @Version 1.0
 */
public class _114_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public void flatten(TreeNode root) {
        if (root == null)return;
        flattenTail(root);
    }

    //返回尾节点
    public TreeNode flattenTail(TreeNode root) {
        if(root.left == null && root.right == null)return root;
        TreeNode left = null,right = null;
        if(root.left != null){
            left = flattenTail(root.left);
        }
        if(root.right != null){
            right = flattenTail(root.right);
        }
        if(left != null){
            TreeNode node = root.right;
            root.right = root.left;
            root.left = null;
            left.right = node;
        }
        return right == null?left:right;
    }

}
