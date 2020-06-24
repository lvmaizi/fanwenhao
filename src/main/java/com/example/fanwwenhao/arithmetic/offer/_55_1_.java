package com.example.fanwwenhao.arithmetic.offer;

/**
 * @Date 2020/6/24 11:43
 * @Version 1.0
 */
public class _55_1_ {

      class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    int max = 0;
    public int maxDepth(TreeNode root) {
        if (root==null)return 0;
        maxDepth(root,0);
        return max;
    }
    //历史深度 depth
    public void maxDepth(TreeNode root,int depth) {
        if(root.right==null&& root.left==null)max=Math.max(max,depth+1);
        if(root.left!=null)maxDepth(root.left,depth+1);
        if(root.right!=null)maxDepth(root.right,depth+1);
    }
}
