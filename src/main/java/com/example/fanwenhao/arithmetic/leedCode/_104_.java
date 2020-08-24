package com.example.fanwenhao.arithmetic.leedCode;

import java.util.Stack;

/**
 * @Date 2020/4/24 10:44
 */
public class _104_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //递归解决
    public int maxDepth(TreeNode root) {
        if(root == null)return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    //非递归解决(未解决)
    public int maxDepth1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if(root!=null)stack.push(root);
        while (!stack.empty()){

        }
        return 0;
    }
}
