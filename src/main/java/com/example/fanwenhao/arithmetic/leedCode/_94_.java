package com.example.fanwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _94_ {
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x;
     }
}

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rs = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        TreeNode p = root;
        while (true){
            //左子树全入栈
            while (p != null){
                stack.push(p);
                p = p.left;
            }
            //访问
            TreeNode t = stack.pop();
            rs.add(t.val);
            //访问右子树
            if(t.right != null){
                p = t.right;
            }
            if(stack.isEmpty() && p == null)break;
        }
        return rs;
    }
}
