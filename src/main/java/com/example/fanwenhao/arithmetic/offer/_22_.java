package com.example.fanwenhao.arithmetic.offer;

/**
 * @Date 2020/7/1 14:52
 * @Version 1.0
 */
public class _22_ {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p0=head,p1=head;
        for (int i=0;i<k;i++){
            p0=p0.next;
        }
        while (p0!=null){
            p0 = p0.next;
            p1 = p1.next;
        }
        return p1;
    }
}
