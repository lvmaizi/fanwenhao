package com.example.fanwwenhao.arithmetic.offer;

import java.util.LinkedList;
import java.util.List;

public class _58_1_ {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        s = s.trim();
        int i = s.length()-1,j=i;
        while (i>=0){
            //找到最后一个单词的初始下标
            while (i>=0){
                if(s.charAt(i) == ' '){
                    stringBuilder.append(s.substring(i+1,j+1) + " ");
                    break;
                }
                else i--;
            }
            //去除中间空格再次开始
            while (i>=0){
               if(s.charAt(i)==' ')i--;
               else {
                   j=i;
                   break;
               }
            }
        }
        stringBuilder.append(s.substring(0,j+1));
        return stringBuilder.toString();
    }

    public String reverseWords1(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = s.split(" ");
        for (int i=strings.length-1;i>=0;i--){
            if(!"".equals(strings[i])){
                stringBuilder.append(strings[i] + " ");
            }
        }

        return stringBuilder.toString().trim();
    }


    public static void main(String[] args) {
        System.out.println(new _58_1_().reverseWords1("a good   example"));
    }
}
