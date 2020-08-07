package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.*;

public class _23_ {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode rs = new ListNode(0);
        ListNode p = rs;
        while (true){
            ListNode item = null;
            int minIndex = 0;
            for (int i = 0;i < lists.length; i++){
                if(lists[i] != null){
                    if(item == null){
                        item = lists[i];
                        minIndex = i;
                    }else {
                        if(item.val > lists[i].val){
                            minIndex = i;
                            item = lists[i];
                        }
                    }
                }
            }
            if(item == null)break;
            else {
                p.next = item;
                p = p.next;
                lists[minIndex] = lists[minIndex].next;
            }
        }
        return rs.next;
    }
}
