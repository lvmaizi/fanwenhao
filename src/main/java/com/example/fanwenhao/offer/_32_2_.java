package com.example.fanwenhao.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _32_2_ {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            Queue<TreeNode> queueTmp = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queueTmp.add(node.left);
                }
                if (node.right != null) {
                    queueTmp.add(node.right);
                }
            }
            result.add(list);
            queue = queueTmp;
        }
        return result;
    }
}
