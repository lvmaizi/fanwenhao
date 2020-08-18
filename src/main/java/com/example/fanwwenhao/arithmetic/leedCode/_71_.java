package com.example.fanwwenhao.arithmetic.leedCode;

import java.util.Stack;

public class _71_ {
    public static void main(String[] args) {
        System.out.println(new _71_().simplifyPath("/home//foo/"));
    }
    public String simplifyPath(String path) {
        Stack stack = new Stack();
        String[] s = path.split("/");
        for (String e:s){
            if("".equals(e) || ".".equals(e)){
               continue;
            }else if("..".equals(e)){
                if(!stack.isEmpty())stack.pop();
            }else {
                stack.push(e);
            }
        }
        StringBuilder res = new StringBuilder();
        if(stack.isEmpty())res.append("/");
        while (!stack.isEmpty()){
            res.insert(0,"/"+stack.pop());
        }
        return res.toString();
    }
}
