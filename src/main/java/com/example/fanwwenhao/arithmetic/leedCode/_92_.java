package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/4/17 15:53
 * @Version 1.0
 */
public class _92_ {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null)return null;
        ListNode pre1=head,pre2;
        for(int i=1;i<m;i++){
            pre1 = pre1.next;
        }
        //反转
        pre2 = pre1.next;
        for (int i=0;i<n-m;i++){
            ListNode pre=pre2,cur = pre2.next,next=cur.next;
            cur.next=pre;
            pre = cur;

        }
        return head;
    }
}
