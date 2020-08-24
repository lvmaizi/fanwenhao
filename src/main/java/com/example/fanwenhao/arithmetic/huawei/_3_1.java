package com.example.fanwenhao.arithmetic.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @Date 2020/7/14 11:52
 * @Version 1.0
 */
public class _3_1 {
    //找出比自己大的数首位相连
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = br.readLine()) != null){
            String[] s = input.split(",");
            String[] result = new String[s.length];
            Stack stack = new Stack();
            stack.push(0);
            for (int i=1;i<s.length;i++){
                while (!stack.isEmpty() && Integer.parseInt(s[i]) > Integer.parseInt(s[(int) stack.peek()])){
                    result[(int) stack.pop()] = s[i];
                }
                stack.push(i);
            }
            //
            for (int i = 0;i<s.length;i++){
                while (!stack.isEmpty() && Integer.parseInt(s[i]) > Integer.parseInt(s[(int) stack.peek()])){
                    result[(int) stack.pop()] = s[i];
                }
            }
            while (stack.size()>0){
                result[(int) stack.pop()] = "-1";
            }
            for (String i:result){
                System.out.print(i+",");
            }
        }
    }
}
