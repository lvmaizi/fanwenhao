package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/29 16:56
 * @Version 1.0
 */
public class _105_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = buildSubTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return root;
    }
    public TreeNode buildSubTree(int[] preorder,int pStart,int pEnd, int[] inorder,int iStart,int iEnd){
        if(pStart > pEnd || iStart > iEnd)return null;
        TreeNode root = new TreeNode(preorder[pStart]);
        for (int i = iStart;i<= iEnd;i ++){
            if(inorder[i] == preorder[pStart]){
                int leftSize = i-iStart;
                root.left = buildSubTree(preorder,pStart+1,pStart+leftSize,inorder,iStart,i-1);
                root.right = buildSubTree(preorder,pStart+leftSize+1,pEnd,inorder,i+1,iEnd);
                break;
            }
        }
        return root;
    }
}
