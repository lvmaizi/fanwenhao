package com.example.fanwenhao.arithmetic.leedCode;

import java.util.Stack;

/**
 * @Date 2019/12/19 19:37
 * @Version 1.0
 */
public class _98_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        TreeNode tmp = root;
        while (!stack.empty()||tmp!=null){
            while (tmp!=null){
                stack.push(tmp);
                tmp = tmp.left;
            }
            TreeNode cur = stack.pop();
            if(pre!=null && pre.val>=cur.val)return false;
            tmp = cur.right;
            pre = cur;
        }
        return true;
    }
}
