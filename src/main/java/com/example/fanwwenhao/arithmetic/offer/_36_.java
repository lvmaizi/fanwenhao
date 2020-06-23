package com.example.fanwwenhao.arithmetic.offer;

/**
 * @Date 2020/6/22 14:28
 * @Version 1.0
 */
public class _36_ {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node() {}
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };
    private Node pre=null,head=null;
    public Node treeToDoublyList(Node root) {
        treeToIndex(root);
        Node p = head,tail=null;
        while (p!=null){
            tail = p;
            p = p.right;
        }
        tail.right = head;
        head.left = tail;
        return head;
    }
    public void treeToIndex(Node root) {
        if (root == null)return;
        treeToIndex(root.left);
        if (pre == null) {
            //记录头节点
            pre = root;
            head = root;
        } else {
            pre.right = root;
            root.left = pre;
            pre =root;
        }
        treeToIndex(root.right);
    }

    public static void main(String[] args) {
        Node p1 = new Node(4);
        Node p2 = new Node(2);
        Node p3 = new Node(5);
        Node p4 = new Node(1);
        Node p5 = new Node(3);

        p1.left = p2;p1.right=p3;
        p2.left = p4;p2.right=p5;
        new _36_().treeToDoublyList(p1);
    }
}
