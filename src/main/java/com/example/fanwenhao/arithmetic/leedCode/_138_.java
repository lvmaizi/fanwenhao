package com.example.fanwenhao.arithmetic.leedCode;

public class _138_ {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if(head == null)return null;
        //赋值链表
        Node p = head;
        while (p != null){
            Node t = new Node(p.val);
            Node next = p.next;
            p.next = t;
            t.next = next;
            p = next;
        }
        //赋值随机指针
        p = head;
        while (p != null){
            Node next = p.next;
            if(p.random != null){
                next.random = p.random.next;
            }
            p = next.next;
        }
        //拆分
        Node newHead = head.next;
        p = head;
        while (p != null) {
            Node next = p.next;
            if (next.next != null){
                p.next = next.next;
                next.next = next.next.next;
            }else {
                p.next = null;
                next.next = null;
            }
            p = p.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node next = new Node(2);
        head.next = next;
        new _138_().copyRandomList(head);
    }
}
