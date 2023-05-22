package com.example.fanwenhao.leetcode;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}

public class _337_ {

    Map<TreeNode, Integer> map  = new HashMap<>();

    public int rob(TreeNode root) {
        if (map.get(root) != null) {
            return map.get(root);
        }
        if (root.right == null && root.left == null) {
            return root.val;
        }
        int max1 = root.val;
        if (root.left != null) {
            if (root.left.left != null) {
                max1 = max1 += rob(root.left.left);
            }
            if ( root.left.right != null) {
                max1 = max1 += rob(root.left.right);

            }
        }
        if (root.right != null) {
            if (root.right.left != null) {
                max1 = max1 += rob(root.right.left);
            }
            if (root.right.right != null) {
                max1 = max1 += rob(root.right.right);

            }
        }
        int max2 = 0;
        if (root.left != null) {
            max2 = max2 + rob(root.left);
        }
        if (root.right != null) {
            max2 = max2 + rob(root.right);
        }
//        System.out.println("max1=" + max1 + " max2=" + max2);
        Integer result = Math.max(max1, max2);
        map.put(root, result);
        return result;
    }
}
