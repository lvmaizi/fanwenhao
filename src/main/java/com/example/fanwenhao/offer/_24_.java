package com.example.fanwenhao.offer;

public class _24_ {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode(0);
        while (head != null) {
            ListNode next = newHead.next;
            newHead.next = head;
            head = head.next;
            newHead.next.next = next;
        }
        return newHead.next;
    }
}
