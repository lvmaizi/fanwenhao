package com.example.fanwwenhao.arithmetic.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Date 2020/6/15 16:37
 * @Version 1.0
 */
public class _32_ {
    class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }
    public int[] levelOrder(TreeNode root) {
        if(root == null)return new int[0];
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.remove();
            linkedList.add(treeNode.val);
            if(treeNode.left!=null)queue.add(treeNode.left);
            if(treeNode.right!=null)queue.add(treeNode.right);
        }
        int[] result = new int[linkedList.size()];
        int i =0;
        for (Integer item:
                linkedList) {
            result[i++] = item;
        }
        return result;
    }
}
