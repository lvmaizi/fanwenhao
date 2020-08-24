package com.example.fanwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2020/7/30 10:59
 * @Version 1.0
 */
public class _113_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    List rs = new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null)return rs;
        dfs(root,sum,new ArrayList());
        return rs;
    }
    public void dfs(TreeNode root, int sum, List list) {
        if(root.left == null && root.right == null && root.val == sum){
            list.add(root.val);
            rs.add(list);
        }
        if(root.left != null){
            List list1 = new ArrayList(list);
            list1.add(root.val);
            dfs(root.left,sum - root.val,list1);}
        if(root.right != null){
            List list2 = new ArrayList(list);
            list2.add(root.val);
            dfs(root.right,sum - root.val,list2);
        }
    }
}
