package com.example.fanwwenhao.arithmetic.offer;

import java.util.*;

/**
 * @Date 2020/6/22 15:25
 * @Version 1.0
 */
public class _38_ {
    List<String> result;
    char[] chars;
    public String[] permutation(String s) {
        result = new LinkedList<>();
        chars = s.toCharArray();
        permutation(0);
        return result.toArray(new String[result.size()]);
    }
    public void permutation(int index) {
        if(index == chars.length-1){
            result.add(new String(chars));
            return;
        }
        HashSet set = new HashSet();
        for (int i=index;i<chars.length;i++){
            if(set.contains(chars[i]))continue;
            set.add(chars[i]);
            swap(chars,index,i);
            permutation(index+1);
            swap(chars,index,i);
        }
    }
    private void swap(char[] chars,int i,int j){
        char tmp = chars[i];
        chars[i]= chars[j];
        chars[j] = tmp;
    }

    public static void main(String[] args) {
        _38_ test = new _38_();
        test.permutation("abc");
        System.out.println(test.result);
    }

}
