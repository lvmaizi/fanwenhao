package com.example.fanwwenhao.arithmetic.offer;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Date 2020/6/24 10:57
 * @Version 1.0
 */
public class _50_ {
    public char firstUniqChar(String s) {
        char result = ' ';
        HashMap<Character,Integer> map = new HashMap();
        for (int i=s.length()-1;i>=0;i--){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else map.put(s.charAt(i),1);
        }
        for (int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return result;
    }
    public char firstUniqChar1(String s) {
        char result = ' ';
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap();
        for (char c:chars){
            if(map.containsKey(c))map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        for (char c:chars){
            if(map.get(c)==1){
                return c;
            }
        }
        return result;
    }
}
