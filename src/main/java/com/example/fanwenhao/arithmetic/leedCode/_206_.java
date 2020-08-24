package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/4/17 14:20
 * @Version 1.0
 */
public class _206_ {
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
   }
    public ListNode reverseList(ListNode head) {
       if(head == null)return null;
       ListNode pre=null,cur=head,next;
       while (cur!=null){
           next = cur.next;
           cur.next = pre;
           pre = cur;
           cur = next;
       }
       return pre;
    }
}
