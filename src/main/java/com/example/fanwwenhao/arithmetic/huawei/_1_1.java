package com.example.fanwwenhao.arithmetic.huawei;

/**
 * @Date 2020/7/22 14:01
 * @Version 1.0
 */

import java.util.Stack;

/**
 * 括号最大深度
 */
public class _1_1 {

    public static void main(String[] args) {
        String s = "[((([]{()}))())]";
        Stack stack = new Stack();
        int maxDepth = 0;
        for (int i=0;i<s.length();i++){
            if(getPair(s.charAt(i)) == ' '){
                stack.push(s.charAt(i));
                maxDepth = Math.max(maxDepth,stack.size()) ;
            }else {
                if(stack.isEmpty() || stack.pop() != getPair(s.charAt(i))){
                    maxDepth = 0;
                    break;
                }
            }
        }
        System.out.println(maxDepth);
    }
    public static Character getPair(char c){
        switch (c){
            case '}': return '{';
            case ')': return '(';
            case ']': return '[';
        }
        return ' ';
    }
}
