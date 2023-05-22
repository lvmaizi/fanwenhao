package com.example.fanwenhao.offer;

public class _25_ {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode tmp = l3;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    tmp.next = l1;
                    l1 = l1.next;
                } else {
                    tmp.next = l2;
                    l2 = l2.next;
                }
                continue;
            }
            if (l1 == null) {
                tmp.next = l2;
                break;
            }
            if (l2 == null) {
                tmp.next = l1;
                break;
            }
        }
        return l3.next;
    }
}
