package com.example.fanwwenhao.arithmetic.leedCode;


public class _82_ {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode p = newHead.next;
        ListNode pre = newHead;
        while (p != null){
            if(p.next != null && p.next.val == p.val){
                int val = p.val;
                while (p!=null && p.val == val){
                    p = p.next;
                }
            }else {
                pre.next = p;
                pre = pre.next;
                p = p.next;
            }
        }
        return newHead.next;
    }
}
