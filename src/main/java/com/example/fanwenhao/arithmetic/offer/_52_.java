package com.example.fanwenhao.arithmetic.offer;

/**
 * @Date 2020/6/24 11:14
 * @Version 1.0
 */
public class _52_ {
    class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0,lenB = 0;
        ListNode p = headA;
        while (p!=null){
            lenA++;
            p=p.next;
        }
        p = headB;
        while (p!=null){
            lenB++;
            p=p.next;
        }
        int size = lenA>lenB?lenA-lenB:lenB-lenA;
        ListNode pMax = lenA>lenB?headA:headB,pMin = lenA>lenB?headB:headA;
        for (int i=0;i<size;i++){
            pMax = pMax.next;
        }
        while (pMax != null){
            if(pMax==pMin)return pMax;
            else {
                pMax = pMax.next;
                pMin = pMin.next;
            }
        }
        return null;
    }
}
