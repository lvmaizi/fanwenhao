package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/5/20 14:29
 * @Version 1.0
 */

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; }
}

public class _21_ {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l2 == null)cur.next = l1;
        if(l1 == null)cur.next = l2;
        return head.next;
    }
}
