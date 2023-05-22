package com.example.fanwenhao.offer;

public class _18_ {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode tmp = newHead;
        while (tmp.next != null) {
            if (tmp.next.val == val) {
                tmp.next = tmp.next.next;
                return newHead.next;
            }
            tmp = tmp.next;
        }
        return newHead.next;
    }
}
