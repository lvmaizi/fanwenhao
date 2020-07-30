package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Date 2020/7/30 13:37
 * @Version 1.0
 */
public class _116_ {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
        public Node() {}
        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        if(root == null)return root;
        Queue<Node> queue = new LinkedList();
        Queue queueNew = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty() ){
            Node pre = queue.poll();
            if(pre.left != null)queueNew.add(pre.left);
            if(pre.right != null)queueNew.add(pre.right);
            while (!queue.isEmpty()){
                Node p = queue.poll();
                pre.next = p;
                pre = p;
                if(pre.left != null)queueNew.add(pre.left);
                if(pre.right != null)queueNew.add(pre.right);
            }
            Queue tmp = queue;
            queue = queueNew;
            queueNew = tmp;
        }
        return root;
    }
}
