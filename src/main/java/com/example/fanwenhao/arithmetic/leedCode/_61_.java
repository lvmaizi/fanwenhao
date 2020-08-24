package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/7/23 14:49
 * @Version 1.0
 */
public class _61_ {
    class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)return null;
        ListNode p1 = head,p2=head,p3=head;
        int num = 0;
        while (p3!=null){
            num++;
            p3 = p3.next;
        }
        k = k%num;
        for (int i=0;i<k;i++){
            p1 = p1.next;
        }
        while (p1.next!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = head;
        ListNode newHead = p2.next;
        p2.next = null;
        return newHead;
    }
}
