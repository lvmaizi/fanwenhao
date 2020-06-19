package com.example.fanwwenhao.arithmetic.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Date 2020/6/15 17:04
 * @Version 1.0
 */
public class _32_2_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        Queue<TreeNode> queue1 = new LinkedList();
        queue.add(root);
        LinkedList<List<Integer>> lists = new LinkedList<>();
        while (!queue.isEmpty() || !queue1.isEmpty()){
            LinkedList linkedList = new LinkedList();
            while (!queue.isEmpty()){
                TreeNode treeNode = queue.remove();
                linkedList.add(treeNode.val);
                if(treeNode.left!=null)queue1.add(treeNode.left);
                if(treeNode.right!=null)queue1.add(treeNode.right);
            }
            if(linkedList.size()>0)lists.add(linkedList);
            LinkedList linkedList1 = new LinkedList();
            while (!queue1.isEmpty()){
                TreeNode treeNode = queue1.remove();
                linkedList1.add(treeNode.val);
                if(treeNode.left!=null)queue.add(treeNode.left);
                if(treeNode.right!=null)queue.add(treeNode.right);
            }
            if(linkedList1.size()>0)lists.add(linkedList1);
        }
        return lists;
    }
}
