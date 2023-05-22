package com.example.fanwenhao.offer;

public class _52_ {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmp1 = headA;
        ListNode tmp2 = headB;
        int flag = 0;
        while (tmp1 != tmp2 && flag <= 2) {
            if (tmp1.next != null) {
                tmp1 = tmp1.next;
            } else {
                tmp1 = headB;
                flag ++;
            }
            if (tmp2.next != null) {
                tmp2 = tmp2.next;
            } else {
                tmp2 = headA;
                flag ++;
            }
        }
        if (tmp1 == tmp2) {
            return tmp1;
        }
        return null;
    }
}
