package com.example.fanwenhao.arithmetic.leedCode;

public class _141_ {
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
         val = x;
         next = null;
    }
}
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head,p2 = head;
        while (p1 != null){
            if(p1.next != null){
                p1 = p1.next.next;
            }else {
                return false;
            }
            p2 = p2.next;
            if(p1 == p2)return true;
        }
        return false;
    }
}
