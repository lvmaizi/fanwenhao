package com.example.fanwenhao.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _20_ {

    Map<Character, Character> map = new HashMap<>();
    {
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
    }

    public boolean isValid(String s) {
        map.get('p');
        if (s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();

        int index = 0;
        while (index < s.length()) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(index++));
                continue;
            }
            if (Character.valueOf(s.charAt(index)).equals(map.get(stack.peek()))) {
                stack.pop();
                index++;
                continue;
            } else {
                stack.push(s.charAt(index++));
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        new _20_().isValid("([)]");
    }
}
