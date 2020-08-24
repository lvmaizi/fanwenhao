package com.example.fanwenhao.arithmetic.offer;

import java.util.*;

/**
 * @Date 2020/6/15 17:21
 * @Version 1.0
 */
public class _32_3_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)return new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack1 = new Stack<>();
        stack.push(root);
        LinkedList<List<Integer>> lists = new LinkedList<>();
        while (!stack.isEmpty() || !stack1.isEmpty()){
            LinkedList linkedList = new LinkedList();
            while (!stack.isEmpty()){
                TreeNode treeNode = stack.pop();
                linkedList.add(treeNode.val);
                if(treeNode.left!=null)stack1.push(treeNode.left);
                if(treeNode.right!=null)stack1.push(treeNode.right);
            }
            if(linkedList.size()>0)lists.add(linkedList);
            LinkedList linkedList1 = new LinkedList();
            while (!stack1.isEmpty()){
                TreeNode treeNode = stack1.pop();
                linkedList1.add(treeNode.val);
                if(treeNode.right!=null)stack.push(treeNode.right);
                if(treeNode.left!=null)stack.push(treeNode.left);
            }
            if(linkedList1.size()>0)lists.add(linkedList1);
        }
        return lists;
    }
}
