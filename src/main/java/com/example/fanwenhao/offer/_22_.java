package com.example.fanwenhao.offer;

public class _22_ {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode tmp = head;
        while (tmp != null && k > 0) {
            tmp = tmp.next;
            k --;
        }
        ListNode result = head;
        while (tmp != null) {
            result = result.next;
            tmp = tmp.next;
        }
        return result;
    }
}
