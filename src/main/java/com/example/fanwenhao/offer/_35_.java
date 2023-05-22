package com.example.fanwenhao.offer;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class _35_ {
    public Node copyRandomList(Node head) {
        Node tmp = head;
        while (tmp != null) {
            Node node = new Node(tmp.val);
            node.next = tmp.next;
            tmp.next = node;
            tmp = node.next;
        }
        tmp = head;
        while (tmp != null) {
            Node node = tmp.next;
            if (tmp.random != null)
                node.random = tmp.random.next;
            tmp = node.next;
        }
        Node newHead = head.next;
        tmp = head;
        while (tmp!= null) {
            Node node = tmp.next;
            tmp.next = node.next;
            if (node.next != null)
                node.next = node.next.next;
            tmp = tmp.next;
        }
        return newHead.next;
    }
}
