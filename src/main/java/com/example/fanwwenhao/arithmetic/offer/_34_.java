package com.example.fanwwenhao.arithmetic.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _34_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    List result = new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null)return result;
        List list = new ArrayList();
        pathSum(root,sum,list);
        return result;
    }
    public void pathSum(TreeNode root, int sum, List history) {
        history.add(root.val);
        if(root.left==null && root.right == null && sum == root.val){
            //记录路径
            record(history);
        }
        if(root.left!=null){pathSum(root.left,sum-root.val,history);}
        if(root.right!=null)pathSum(root.right,sum-root.val,history);
        history.remove(history.size()-1);
    }
    public void record(List history){
        List list = new ArrayList();
        for (int i=0;i<history.size();i++){
            list.add(i,history.get(i));
        }
        result.add(list);
    }
}
