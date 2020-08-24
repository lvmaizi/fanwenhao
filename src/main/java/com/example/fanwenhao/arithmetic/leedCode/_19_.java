package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/21 17:37
 * @Version 1.0
 */


public class _19_ {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode p1=newHead,p2=newHead;
        for (int i=0;i<n;i++){
            p1 = p1.next;
        }
        while (p1.next != null){
            p2 = p2.next;
            p1 = p1.next;
        }
        p2.next = p2.next.next;
        return newHead.next;
    }
}
