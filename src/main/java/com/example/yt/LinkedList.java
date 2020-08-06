package com.example.yt;

public class LinkedList {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node p = head1;
        for (int i = 2;i< 5;i++){
            Node node = new Node(i);
            p.next = node;
            p = p.next;
        }
        Node head2 = new Node(5);
        Node p1 = head2;
        for (int i = 6;i<= 8;i++){
            Node node = new Node(i);
            p1.next = node;
            p1 = p1.next;
        }
        Node rs = merge1(head1,head2);
        while (rs != null){
            System.out.println(rs.val);
            rs = rs.next;
        }
    }
    public static Node merge(Node head1,Node head2){
        Node head = new Node(0);
        Node p = head;
        while (head1 != null && head2 != null){
            if(head1.val <= head2.val){
                p.next = head1;
                p = p.next;
                head1 = head1.next;
            }else {
                p.next = head2;
                p = p.next;
                head2 = head2.next;
            }
        }
        if(head1 != null)p.next = head1;
        if(head2 != null)p.next = head2;
        return head.next;
    }
    public static Node merge1(Node head1,Node head2){
        if(head1 == null)return head2;
        if(head2 == null)return head1;
        Node head = null;
        if(head1.val <= head2.val){
            head = head1;
            head1.next = merge(head1.next,head2);
        }else {
            head = head2;
            head2.next = merge(head1,head2.next);
        }
        return head;
    }
}
