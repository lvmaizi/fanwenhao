package com.example.fanwwenhao.arithmetic.huawei;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Date 2020/7/23 17:50
 * @Version 1.0
 */
public class _5_5 {
    public static void main(String[] args) {
        String input = "5#2$6";
//        String s = input;
//        //先算#
//        for (int i=0;i<input.length();i++){
//            if(input.charAt(i) == '#'){
//                //前面的数
//                int pre = i-1;
//                while (pre>0 && pre != '#' && pre != '$'){
//                    pre--;
//                }
//                int post = i+1;
//                while (post<input.length() && post != '#' && post != '$'){
//                    post++;
//                }
//                //计算
//                int rs = Integer.parseInt(input.substring(pre,i))*2 + Integer.parseInt(input.substring(i+1,post+1));
//                //截取替换
//            }
//        }
//        //再算$
        List<String> list = new ArrayList();
        int start = 0;
        for (int i=0;i<input.length();i++){
            if(input.charAt(i) == '#' || input.charAt(i) == '$'){
                list.add(input.substring(start,i));
                list.add(input.substring(i,i+1));
                start = i+1;
            }
        }
        list.add(input.substring(start,input.length()));
        Stack<String> stack = new Stack();
        //先算#
        for (int i=0;i<list.size();i++){
            if(!stack.isEmpty() && "#".equals(stack.peek())){
                stack.pop();
                int x = Integer.parseInt(stack.pop());
                int y = Integer.parseInt(list.get(i));
                stack.push(String.valueOf(2*x+y));
            }else {
                stack.push(list.get(i));
            }
        }
        //在算$
        List<String> list2 = new LinkedList();
        while (!stack.isEmpty()){
            list2.add(0,stack.pop());
        }
        for (int i=0;i<list2.size();i++){
            if(!stack.isEmpty() && "$".equals(stack.peek())){
                stack.pop();
                int x = Integer.parseInt(stack.pop());
                int y = Integer.parseInt(list2.get(i));
                stack.push(String.valueOf(x+3*y));
            }else {
                stack.push(list2.get(i));
            }
        }
        System.out.println(stack.peek());
    }
}
