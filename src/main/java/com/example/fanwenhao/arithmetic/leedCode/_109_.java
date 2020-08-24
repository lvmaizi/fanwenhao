package com.example.fanwenhao.arithmetic.leedCode;

import java.util.ArrayList;
import java.util.List;

public class _109_ {
class ListNode {
   int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class TreeNode {
   int val;
    TreeNode left;
    TreeNode right;
     TreeNode(int x) { val = x; }
 }
    public TreeNode sortedListToBST(ListNode head) {
        List nodes = new ArrayList();
        ListNode p = head;
        while (p != null){
            nodes.add(p.val);
            p = p.next;
        }
        return sortedListToBST(nodes,0,nodes.size()-1);
    }
    public TreeNode sortedListToBST(List<Integer> nodes,int start,int end){
        if(start > end)return null;
        int mid = (start + end) / 2;
        TreeNode t = new TreeNode(nodes.get(mid));
        t.left = sortedListToBST(nodes,start,mid-1);
        t.right = sortedListToBST(nodes,mid+1,end);
        return t;
    }
}
