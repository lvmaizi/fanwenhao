package com.example.fanwwenhao.arithmetic.offer;

public class _35_ {
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
        Node p = head;
        //复制链表
        while (p != null){
            Node node = new Node(p.val);
            node.next = p.next;
            p.next = node;
            p = node.next;
        }
        //复制链表的随机指向
        p = head;
        while (p != null){
            if(p.random != null)p.next.random = p.random.next;
            p = p.next.next;
        }
        //链表拆分
        p = head;
        Node p1 = new Node(0),p2 = new Node(0),p3=p1,p4=p2;
        while (p != null){
            p3.next = p;
            p4.next = p.next;
            p3 = p3.next;
            p4 = p4.next;
            p = p.next.next;
        }
        p3.next = null;
        return p2.next;
    }

    public static void main(String[] args) {
        Node p1 = new Node(7);
        Node p2 = new Node(13);
        Node p3 = new Node(11);
        Node p4 = new Node(10);
        Node p5 = new Node(1);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p2.random=p1;
        p3.random=p5;
        p4.random = p3;
        p5.random=p1;
        new _35_().copyRandomList(p1);


    }
}
