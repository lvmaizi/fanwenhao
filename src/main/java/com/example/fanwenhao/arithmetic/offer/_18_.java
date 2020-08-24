package com.example.fanwenhao.arithmetic.offer;

/**
 * @Date 2020/7/1 14:17
 * @Version 1.0
 */
public class _18_ {
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode deleteNode(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode p = newHead;
        while (p!=null&&p.next!=null){
            ListNode p1=p.next;
            if(p1.val == val){
                p.next = p1.next;
                p = p.next;
            }else {
                p=p.next;
            }
        }
        return newHead.next;
    }
}
