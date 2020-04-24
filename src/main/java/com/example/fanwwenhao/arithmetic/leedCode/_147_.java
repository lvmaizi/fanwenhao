package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/4/24 15:17
 * @Version 1.0
 */
public class _147_ {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode newHead = new ListNode(0);
        //p:遍历指针
        ListNode p = head;
        while (p!=null){
            //新链表的临时遍历节点
            ListNode p1 = newHead;
            ListNode pNext = p.next;
            p.next=null;

            while (true){
                if(p1.next == null){
                    p1.next = p;
                    break;
                }else if(p1.next.val>=p.val){
                    ListNode tmp = p1.next;
                    p1.next = p;
                    p.next = tmp;
                    break;
                }else {
                    p1 = p1.next;
                }
            }
            p = pNext;
        }
        return newHead.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        int [] array = {1,2,7,4,5};
        ListNode pre = head;
        for (int a:array){
            ListNode listNode = new ListNode(a);
            pre.next = listNode;
            pre = pre.next;
        }

        new _147_().insertionSortList(head.next);
    }
}
