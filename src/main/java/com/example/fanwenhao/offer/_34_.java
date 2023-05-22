package com.example.fanwenhao.offer;

import java.util.ArrayList;
import java.util.List;

public class _34_ {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        dfs(root, target, curr,result);
        return result;
    }

    private void dfs(TreeNode node, int target, List<Integer> curr, List<List<Integer>> result) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            if (target == node.val) {
                curr.add(node.val);
                result.add(new ArrayList<>(curr));
                curr.remove(curr.size() - 1);
            }
            return;
        }
        curr.add(node.val);
        if (node.left != null) {
            dfs(node.left, target - node.val, curr, result);
        }
        if (node.right != null) {
            dfs(node.right, target - node.val, curr, result);
        }
        curr.remove(curr.size() - 1);
    }
}
