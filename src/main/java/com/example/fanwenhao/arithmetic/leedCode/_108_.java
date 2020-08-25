package com.example.fanwenhao.arithmetic.leedCode;

public class _108_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length-1);
    }
    public TreeNode sortedArrayToBST(int[] nums,int start,int end) {
        if(start > end)return null;
        int mid = (start + end) / 2;
        TreeNode t = new TreeNode(nums[mid]);
        t.left = sortedArrayToBST(nums,start,mid - 1);
        t.right = sortedArrayToBST(nums,mid + 1,end);
        return t;
    }
}
