package com.example.fanwenhao.offer;
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class _06_ {
    public int[] reversePrint(ListNode head) {
        int length = 0;
        ListNode headTmp = head;
        while (headTmp != null) {
            length++;
            headTmp = headTmp.next;
        }
        int result[] = new int[length];
        while (length > 0) {
            result[length - 1] = head.val;
            head = head.next;
            length --;
        }
        return result;
    }
}
