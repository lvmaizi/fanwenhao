package com.example.fanwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Date 2020/7/29 17:39
 * @Version 1.0
 */
public class _107_ {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List rs = new LinkedList();
        if(root == null)return rs;
        Queue queue1 = new LinkedList();
        Queue queue2 = new LinkedList();
        queue1.add(root);
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            List item = new ArrayList();
            if(!queue1.isEmpty()){
                while (!queue1.isEmpty()){
                    TreeNode t = (TreeNode) queue1.poll();
                    if(t.left != null)
                        queue2.add(t.left);
                    if(t.right != null){
                        queue2.add(t.right);
                    }
                    item.add(t.val);
                }
                rs.add(0,item);
            } else {
                while (!queue2.isEmpty()){
                    TreeNode t = (TreeNode) queue2.poll();
                    if(t.left != null)
                        queue1.add(t.left);
                    if(t.right != null){
                        queue1.add(t.right);
                    }
                    item.add(t.val);
                }
                rs.add(0,item);
            }
        }
        return rs;
    }
}
