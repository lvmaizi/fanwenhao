package com.example.fanwenhao.arithmetic.leedCode;

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
        if(head==null||head.next==null)return head;
        //设置假的头节点
        ListNode h = new ListNode(0);
        h.next = head;
        //找到需反转的起始节点 pre1:反转位置的上一个节点
        ListNode pre1=h;
        for (int i=1;i<m;i++){
            pre1=pre1.next;
        }
        //进行反转pre2:反转起始节点 临时变量pre3:遍历过程中被指向的引用cur:操作的元素tail:保存尾部引用
        ListNode pre2=pre1.next,pre3=pre1.next,cur=pre3.next,tail=null;
        for (int i=0;i<n-m;i++){
            tail = cur.next;
            cur.next = pre3;
            pre3 = cur;
            cur = tail;
        }
        //反转结束链接节点
        pre1.next=pre3;
        pre2.next=cur;
        return h.next;
    }
    //给定头指针反转指定长度的链表串，并返回
}
