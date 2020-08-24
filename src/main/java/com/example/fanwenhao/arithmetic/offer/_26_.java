package com.example.fanwenhao.arithmetic.offer;

public class _26_ {
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A==null)return false;
        if (B == null)return false;
        return isInclude(A,B) || isSubStructure(A.right,B) || isSubStructure(A.left,B);
    }
    public boolean isInclude(TreeNode A, TreeNode B){
        if(B==null)return true;
        if(A==null)return false;
        if(A.val == B.val)
            return isInclude(A.left,B.left) && isInclude(A.right,B.right);
        return false;
    }
}
