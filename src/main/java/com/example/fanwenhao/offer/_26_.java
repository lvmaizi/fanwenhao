package com.example.fanwenhao.offer;

public class _26_ {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        if (isEqualsSubStructure(A, B)) {
            return true;
        }
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isEqualsSubStructure(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (a == null) {
            return false;
        }
        if (a.val == b.val) {
            return isEqualsSubStructure(a.left, b.left) && isEqualsSubStructure(a.right, b.right);
        }
        return false;
    }
}
