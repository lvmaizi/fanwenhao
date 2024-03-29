package com.example.fanwenhao.offer;

public class _36_ {
    Node pre,head;
    public Node treeToDoublyList(Node root) {
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (pre != null) {
            pre.right = node;
        } else {
            head = node;
        }
        node.left = pre;
        pre = node;
        dfs(node.right);
    }


    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
}
