package com.example.fanwenhao.offer;

public class _07_ {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder,  0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[preStart]);
        int preSize = 0;
        for (int i = inStart; i <= inEnd; i ++) {
            if (inorder[i] == preorder[preStart]) {
                break;
            }
            preSize ++;
        }
        treeNode.left = buildTree(preorder, preStart + 1, preStart + preSize, inorder, inStart, inStart + preSize - 1);
        treeNode.right = buildTree(preorder, preStart + preSize + 1, preEnd, inorder, inStart + preSize + 1, inEnd);
        return treeNode;
    }
}
