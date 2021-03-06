package com.example.fanwenhao.arithmetic.offer;

/**
 * @Date 2020/6/15 18:42
 * @Version 1.0
 */
public class _33_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean verifyPostorder(int[] postorder) {
        return verifyPostorder(postorder,0,postorder.length-1);
    }
    public boolean verifyPostorder(int[] postorder,int start, int end) {
        if(start>=end)return true;
        for(int i=end-1;i>=start;i--){
            if(postorder[i]<postorder[end]){
                //是否满足start - > i 都小于根节点
                for (int j=start;j<=i;j++){
                    if(postorder[j]>postorder[end])return false;
                }
                return verifyPostorder(postorder,start,i) && verifyPostorder(postorder,i+1,end-1);
            }
        }
        return verifyPostorder(postorder,start,end-1);
    }
}
