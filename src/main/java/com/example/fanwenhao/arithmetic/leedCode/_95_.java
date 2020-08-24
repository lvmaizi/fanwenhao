package com.example.fanwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.List;

public class _95_ {
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
    public List<TreeNode> generateTrees(int n) {
        isUsed = new boolean[n+1];
        return generateTrees(1,n);
    }
    boolean isUsed[];
    public List<TreeNode> generateTrees(int start, int end) {
        List rs = new ArrayList();
        if(start > end){
            rs.add(null);
            return rs;
        }
        for (int i = start; i <= end; i++){
            if(isUsed[i] == false){
                isUsed[i] = true;
                List<TreeNode> lefts = generateTrees(start,i-1);
                List<TreeNode> rights = generateTrees(i+1,end);
                for (TreeNode left:lefts){
                    for (TreeNode right:rights){
                        TreeNode root = new TreeNode(i);
                        root.left = left;
                        root.right = right;
                        rs.add(root);
                    }
                }
                isUsed[i] = false;
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        List<TreeNode> rs = new _95_().generateTrees(3);
        System.out.println(rs);
    }
}
