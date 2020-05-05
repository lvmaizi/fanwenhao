package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/4/20 17:19
 * @Version 1.0
 */
public class _83_ {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        //临时变量cur:遍历过程中操作的元素
        //pre:当前重复的首节点
        ListNode cur=head.next,pre=head;
        while (cur!=null){
            if(pre.val==cur.val){
                //删除
                ListNode tmp = cur;
                cur = cur.next;
                tmp = null;
                pre.next=cur;
            }else {
                pre = cur;
                cur =cur.next;
            }
        }
        return head;
    }
}
