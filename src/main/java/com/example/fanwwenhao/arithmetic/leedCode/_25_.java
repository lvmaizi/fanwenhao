package com.example.fanwwenhao.arithmetic.leedCode;

/**
 * @Date 2020/4/24 14:18
 * @Version 1.0
 */
public class _25_ {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode head1 = new ListNode(0);
        head1.next = head;
        ListNode pre = head;
        //保存反转前的节点
        ListNode pre2 = head1;
        first:while (true){
            //是否能够反转
            ListNode tail;
            //临时节点保存的是遍历过程的节点，也为遍历结束后的节点
            ListNode pre1 = pre;
            for (int i=1;i<=k;i++){
                if(pre1 == null)break first;
                pre1 = pre1.next;
            }
            pre2.next = reverse(pre,k);
            pre.next = pre1;
            //
            pre2 = pre;
            pre = pre2.next;
        }
        return head1.next;
    }
    //给定头节点返回反转后的头节点
    public ListNode reverse(ListNode head,int k){
        if(k<=1)return head;
        ListNode next = head;
        ListNode next1 = head.next;
        for (int i=1;i<k;i++){
            ListNode tmp = next1.next;
            next1.next = next;
            next = next1;
            next1 = tmp;
        }
        return next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        int [] array = {1,2,3,4,5};
        ListNode pre = head;
        for (int a:array){
            ListNode listNode = new ListNode(a);
            pre.next = listNode;
            pre = pre.next;
        }

        new _25_().reverseKGroup(head.next,2);
    }

}
