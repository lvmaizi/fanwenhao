package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/29 17:19
 * @Version 1.0
 */
public class _106_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildSubTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode buildSubTree(int[] inorder, int iStart,int iEnd,int[] postorder,int pStart,int pEnd) {
        if(iStart > iEnd || pStart > pEnd)return null;
        TreeNode treeNode = new TreeNode(postorder[pEnd]);
        for (int i = iStart; i <= iEnd; i++){
            if(inorder[i] == postorder[pEnd]){
                int leftSize = i-iStart;
                treeNode.left =  buildSubTree(inorder,iStart,i-1,postorder,pStart,pStart+leftSize-1);
                treeNode.right = buildSubTree(inorder,i+1,iEnd,postorder,pStart+leftSize,pEnd-1);
            }
        }
        return treeNode;
    }
}
