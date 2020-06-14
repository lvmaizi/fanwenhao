package com.example.fanwwenhao.arithmetic.offer;

import java.util.Stack;

public class _30_ {
    public _30_(){
        min  = new Stack();
    }
    static class Node{
        private Node(int x){
            this.val=x;
        }
        int val;
        Node next;
        Node pre;
    }
    Stack<Integer> min ;
    Node p ;
    public void push(int x) {
        if(p == null){
            p = new Node(x);
            min.push(x);
        }else {
            Node i = new Node(x);
            p.next = i;
            i.pre = p;
            if(x<=min.peek())min.push(x);
            p = i;
        }
    }

    public void pop() {
        if(p!=null){
            if(p.val==min.peek()){
                min.pop();
            }
            p=p.pre;
        }
    }

    public int top() {
        if(p!=null){
            return p.val;
        }
        return 0;
    }

    public int min() {
        if(!min.empty())return min.peek();
        return 0;
    }

    public static void main(String[] args) {
        _30_ d = new _30_();
        d.push(2);
        d.push(0);
        d.push(3);
        d.push(0);
        d.pop();
        d.pop();
        d.pop();

        System.out.println(d.min());
    }
}
