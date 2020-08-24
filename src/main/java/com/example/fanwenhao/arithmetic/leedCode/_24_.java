package com.example.fanwenhao.arithmetic.leedCode;

/**
 * @Date 2020/4/24 13:54
 * @Version 1.0
 */
public class _24_ {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode pre = preHead;
        //若后置存在两元素则做交换
        while (pre !=null && pre.next != null && pre.next.next != null){
            ListNode next = pre.next;
            ListNode next1 = pre.next.next;
            ListNode next2 = pre.next.next.next;
            next.next = next2;
            next1.next = next;
            pre.next = next1;
            pre = pre.next.next;
        }
        return preHead.next;
    }
}
