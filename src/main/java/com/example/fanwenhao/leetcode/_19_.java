package com.example.fanwenhao.leetcode;

import java.util.List;

public class _19_ {

    private class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode head_h = new ListNode();
        head_h.next = head;
        ListNode p1 = head_h;
        while (n > 0) {
            p1 = p1.next;
            n--;
        }
        ListNode p2 = head_h;
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return head_h.next;
    }
}
