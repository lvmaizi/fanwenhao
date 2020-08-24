package com.example.fanwenhao.arithmetic.leedCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Date 2020/5/20 10:59
 * @Version 1.0
 */
public class _20_ {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        if(s.length() == 0)return true;
        Stack<Character> stack = new Stack();
        for (int i=0;i<s.length();i++){
            if(!stack.isEmpty() && map.get(stack.peek())!=null && s.charAt(i) == map.get(stack.peek())){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        if(stack.empty())return true;
        return false;
    }

    public static void main(String[] args) {
        new _20_().isValid("([)]");
    }
}
