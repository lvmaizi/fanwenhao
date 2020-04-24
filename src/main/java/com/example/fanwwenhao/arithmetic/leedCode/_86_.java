package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/4/20 17:32
 * @Version 1.0
 */
public class _86_ {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode partition(ListNode head, int x) {
        //cur 当前遍历的节点，pre:遍历的节点需插入的位置，cur0:当前位置的前一个位置
        ListNode cur=head,l1=new ListNode(0),l2=new ListNode(0);
        ListNode l1Tmp=l1,l2Tmp=l2;
        while (cur != null){
            if(cur.val<x){
                l1Tmp.next=cur;
                l1Tmp=l1Tmp.next;
                cur = cur.next;
            }else {
                l2Tmp.next=cur;
                l2Tmp=l2Tmp.next;
                cur = cur.next;
            }
        }
        l1Tmp.next=l2.next;
        l2Tmp.next=null;
        return l1.next;
    }
}
