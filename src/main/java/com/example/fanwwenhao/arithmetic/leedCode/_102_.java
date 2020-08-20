package com.example.fanwwenhao.arithmetic.leedCode;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102_ {
class TreeNode {
   int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
    public List<List<Integer>> levelOrder(TreeNode root) {
        List rs = new ArrayList();
        if(root == null)return rs;
        Queue queue1 = new LinkedList();
        Queue queue2 = new LinkedList();
        queue1.add(root);
        while (!queue1.isEmpty() || !queue2.isEmpty()){
            if(!queue1.isEmpty()){
                List item = new ArrayList();
                while (!queue1.isEmpty()){
                    TreeNode o = (TreeNode) queue1.poll();
                    if(o.left != null)queue2.add(o.left);
                    if(o.right != null)queue2.add(o.right);
                    item.add(o.val);
                }
                rs.add(item);
            }
            if(!queue2.isEmpty()){
                List item = new ArrayList();
                while (!queue2.isEmpty()){
                    TreeNode o = (TreeNode) queue2.poll();
                    if(o.left != null)queue1.add(o.left);
                    if(o.right != null)queue1.add(o.right);
                    item.add(o.val);
                }
                rs.add(item);
            }
        }
        return rs;
    }
}
