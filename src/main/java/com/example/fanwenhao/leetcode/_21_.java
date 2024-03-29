package com.example.fanwenhao.leetcode;

import java.util.List;
public class _21_ {

    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode p = head;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                p.next = list2;
                break;
            }
            if (list2 == null) {
                p.next = list1;
                break;
            }
            if (list1.val <=  list2.val) {
                p.next = list1;
                list1 = list1.next;
                p = p.next;
            } else {
                p.next = list2;
                list2 = list2.next;
                p = p.next;
            }
        }
        return head.next;
    }
}
