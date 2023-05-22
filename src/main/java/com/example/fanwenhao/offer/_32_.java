package com.example.fanwenhao.offer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class _32_ {
    public int[] levelOrder(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        levelOrder(root, result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private void levelOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            result.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

}
