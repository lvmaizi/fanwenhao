package com.example.fanwenhao.offer;

import java.util.*;

public class _32_3_ {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        boolean flag = true;
        while (!queue.isEmpty()) {
            Queue<TreeNode> nodeQueue = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            while (!nodeQueue.isEmpty()) {
                TreeNode node = nodeQueue.poll();
                list.add(node.val);
                if (node.left != null) {
                    nodeQueue.add(node.left);
                }
                if (node.right != null) {
                    nodeQueue.add(node.right);
                }
            }
            if (flag) {
                Collections.reverse(list);
            }
            result.add(list);
            queue = nodeQueue;
            flag = !flag;
            System.out.println(flag);
        }
        return result;
    }
}
