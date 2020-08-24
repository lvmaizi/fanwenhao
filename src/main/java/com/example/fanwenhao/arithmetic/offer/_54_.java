package com.example.fanwenhao.arithmetic.offer;

/**
 * @Date 2020/6/24 11:27
 * @Version 1.0
 */
public class _54_ {
   class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }

    int result = 0;
    int max = 0;
    //右中左
    public int kthLargest(TreeNode root, int k) {
        if (root == null)return result;
        if(root.right != null)kthLargest(root.right,k);
        if(++max==k){
            result =  root.val;
            return result;
        }
        if(root.left!=null)kthLargest(root.left,k);
        return result;
    }


}
