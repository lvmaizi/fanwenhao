package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.*;

/**
 * @Date 2020/7/29 16:33
 * @Version 1.0
 */
public class _103 {
    class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List rs = new ArrayList();
        if(root == null)return rs;
        Stack stack1 = new Stack();
        stack1.push(root);
        Stack stack2 = new Stack();
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            List item = new ArrayList();
            if(!stack1.isEmpty()){
                while (!stack1.isEmpty()){
                    TreeNode e = (TreeNode) stack1.pop();
                    item.add(e.val);
                    if(e.left != null)stack2.push(e.left);
                    if(e.right != null)stack2.push(e.right);
                }
            }else {
                while (!stack2.isEmpty()){
                    TreeNode e = (TreeNode) stack2.pop();
                    item.add(e.val);
                    if(e.right != null)stack1.push(e.right);
                    if(e.left != null)stack1.push(e.left);
                }
            }
            rs.add(item);
        }
        return rs;
    }
}
