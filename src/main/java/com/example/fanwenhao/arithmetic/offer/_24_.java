package com.example.fanwenhao.arithmetic.offer;

/**
 * @Date 2020/7/1 14:59
 * @Version 1.0
 */
public class _24_ {
    public ListNode reverseList(ListNode head) {
        ListNode tail = new ListNode(0);
        while (head!=null){
            ListNode p = head.next;
            ListNode p2 = tail.next;
            tail.next = head;
            head.next = p2;
            head = p;
        }
        return tail.next;
    }
}
